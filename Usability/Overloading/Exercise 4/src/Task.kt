// Overloading/Task4.kt
package overloadingExercise4

import atomictest.eq

fun f(n: Int = 0, i: Int) = n + i

fun main() {
    f(i = 373) eq 373
}