// NullableExtensions/Task2.kt
package extensionsForNullableTypesExercise2

import atomictest.eq

fun Boolean?.and(that: Boolean?): Boolean? =
    when {
        this == null || that == null -> null
        this == true && that == true -> true
        else -> false
    }

fun Boolean?.or(that: Boolean?): Boolean? =
    when {
        this == null || that == null -> null
        this == true || that == true -> true
        else -> false
    }

fun main() {
    val b = true
    b.and(null) eq null
    null.or(b) eq null
    b.or(false) eq true
}