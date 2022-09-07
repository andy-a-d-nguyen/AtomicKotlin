// NonNullAssertions/Task2.kt
package nonNullAssertionsExercise2

import atomictest.*

fun List<Int>.headPlusTail(): Triple<Int?, Int?, Int?> =
    when {
        this.isEmpty() -> Triple(null, null, null)
        this.size == 1 -> Triple(this.first(), null, this.first())
        else -> Triple(this.first(), this.last(), this.first() + this.last())
    }

fun main() {
    val ints = mutableListOf<Int>()
    trace(ints.headPlusTail())
    for (n in -2..10 step 2) {
        ints.add(n)
        trace(ints.headPlusTail())
        trace(ints.headPlusTail()!!.third)
    }
    trace eq """
        (null, null, null)
        (-2, null, -2)
        -2
        (-2, 0, -2)
        -2
        (-2, 2, 0)
        0
        (-2, 4, 2)
        2
        (-2, 6, 4)
        4
        (-2, 8, 6)
        6
        (-2, 10, 8)
        8
    """
}