// Inheritance/Task2.kt
package inheritanceExercise2

import inheritanceExercise1.Detergent
import atomictest.eq

class Disinfectant : Detergent() {
    fun sterilize() = ops.add("sterilize")
}

fun main() {
    val disinfectant = Disinfectant()
    disinfectant.dilute()
    disinfectant.apply()
    disinfectant.scrub()
    disinfectant.sterilize()
    disinfectant.ops eq
            listOf("dilute", "apply", "scrub", "sterilize")
}