// NamedAndDefaultArgs/Task2.kt
package namedAndDefaultArgumentsExercise2

import atomictest.eq

class SimpleTime(
    private val hours: Int = 0,
    private val minutes: Int = 0,
    private val seconds: Int = 0,
    private val nanoseconds: Int = 0
) {
    fun toSecondOfDay(): Int =
        hours * 60 * 60 + minutes * 60 + seconds

    fun toNanoOfDay(): Long =
        (hours * 60 * 60 + minutes * 60 + seconds) * 1_000_000_000L + nanoseconds
}

fun main() {
    val noon = SimpleTime(12)
    noon.toSecondOfDay() eq 12 * 60 * 60

    val nanosecond = SimpleTime(nanoseconds = 1)
    nanosecond.toNanoOfDay() eq 1

    val second = SimpleTime(seconds = 1)
    second.toNanoOfDay() eq 1000000000L

    val halfPastSeven = SimpleTime(hours = 6, minutes = 30)
    halfPastSeven.toNanoOfDay() eq (6 * 60 + 30) * 60 * 1000000000L
}
