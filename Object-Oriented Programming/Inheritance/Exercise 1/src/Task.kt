// Inheritance/Task1.kt
package inheritanceExercise1

import atomictest.eq

open class Cleanser {
    val ops = mutableListOf<String>()
    fun dilute() = ops.add("dilute")
    fun apply() = ops.add("apply")
    fun scrub() = ops.add("scrub")
}

open class Detergent : Cleanser()

fun main() {
    val detergent = Detergent()
    detergent.dilute()
    detergent.apply()
    detergent.scrub()
    detergent.ops eq
            listOf("dilute", "apply", "scrub")
}