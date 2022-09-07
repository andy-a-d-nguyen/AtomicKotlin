// Testing/Task2.kt
package testingExercise2

import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
    sum(1, 1, 1) eq 3
    sum(1, 2, 3) neq 4
    sum(2, 2, 2) eq 6
    sum(2, 3, 4) neq 1
    sum(4, 4, 4) neq 4
}