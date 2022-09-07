// BreakAndContinue/Task1.kt
package breakAndContinueExercise1

import atomictest.*

fun readNumbers(vararg n: String) {
    var result = 0
    for (element in n) {
        when (element.toIntOrNull()) {
            0 -> {
                trace("Sum: $result")
                break
            }

            null -> {
                trace("Not a number: $element")
                continue
            }

            else -> {
                result += element.toInt()
            }
        }
    }
}

fun main() {
    readNumbers("1", "a", "3", "10", "0", "19")
    trace eq """
        Not a number: a
        Sum: 14
    """
}