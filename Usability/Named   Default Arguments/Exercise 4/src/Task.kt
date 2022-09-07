// NamedAndDefaultArgs/Task4.kt
package namedAndDefaultArgumentsExercise4

import atomictest.eq
import numberTypesExercise1.d

fun foo(i: Int, s: String, d: Double) = "(i = $i, s = $s)"

fun bar(i: Int, s: String, d: Double) = "(i = $i, s = $s)"

fun main() {
    foo(i = 1, s = "abc", d = 1.0) eq "(i = 1, s = abc)"
    foo(2, "def", 1.0) eq "(i = 2, s = def)"

    bar(i = 1, s = "abc", 1.0) eq "(i = 1, s = abc)"
    bar(2, "def", 1.0) eq "(i = 2, s = def)"
}