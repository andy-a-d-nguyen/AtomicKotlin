// HigherOrderFunctions/Repeat.kt
package higherorderfunctions

import atomictest.*

fun repeat(
    times: Int,
    action: (Int) -> Unit           // [1]
) {
    for (index in 0 until times) {
        action(index)                 // [2]
    }
}

fun main() {
    repeat(3) { trace("#$it") }     // [3]
    trace eq "#0 #1 #2"
}