// SafeCallsAndElvis/Task1.kt
package safeCallsAndTheElvisOperatorExercise1

import atomictest.eq

fun downcase(string: String?) = string?.lowercase() ?: ""

fun main() {
    downcase(null) eq ""
    downcase("ABC") eq "abc"
}