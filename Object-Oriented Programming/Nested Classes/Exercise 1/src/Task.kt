// NestedClasses/NestedEx1.kt
package nestedClassesExercise1

import atomictest.eq
import nestedClassesExercise1.Game.Mark.*
import kotlin.random.Random

interface Game {
    enum class Mark { Blank, X, Y, Z }
}

class FillIt(
    private val side: Int = 3, randomSeed: Int = 0
) : Game {
    private val rand = Random(randomSeed)
    private val grid =
        MutableList(side * side) { Blank }
    private var player = X
    private fun turn(): Boolean {
        val blanks = grid.withIndex()
            .filter { it.value == Blank }

        if (blanks.isEmpty()) return false

        grid[blanks.random(rand).index] = player
        when (player) {
            X -> Y
            Y -> Z
            Z -> X
            Blank -> throw IllegalStateException()
        }
        return true
    }

    fun play() {
        while (!turn())
            turn()
    }

    override fun toString() =
        grid.chunked(side).joinToString("\n")
}

fun main() {
    val game = FillIt(8, 17)
    game.play()
    game eq """
        [X, Z, Y, Z, Z, Y, X, Y]
        [Y, Z, Z, Y, Z, Y, Y, Z]
        [Z, Y, Z, Y, Y, X, X, Y]
        [X, X, X, Y, Y, X, X, Y]
        [X, X, Z, X, Z, X, X, X]
        [Z, X, Z, X, Y, Z, Z, Z]
        [Y, Y, X, Y, Z, Z, Z, X]
        [Y, X, Z, Y, Y, X, X, Z]
    """
}