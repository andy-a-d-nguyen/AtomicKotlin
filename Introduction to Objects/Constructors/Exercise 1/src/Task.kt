// Constructors/Task1.kt
package constructorsExercise1

import numberTypesExercise1.d

class Floating(val d: Double) {
    override fun toString(): String = d.toString()
}

fun main() {
    val f = Floating(1.0)
    println(f.toString())
}