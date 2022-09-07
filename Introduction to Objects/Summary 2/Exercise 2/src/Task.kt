// Summary2/Task2.kt
package summaryIIExercise2

import atomictest.eq

class Boring2(
    private val a: Double,
    private val b: String,
    private val c: Int
) {
    fun a() = a
    fun b() = b
    fun c() = c
}

fun main() {
    val boring2 = Boring2(1.618, "ratio", 11)
    boring2.a() eq 1.618
    boring2.b() eq "ratio"
    boring2.c() eq 11
}