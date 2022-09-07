// FoldingLists/Task3.kt
package foldingListsExercise3

import atomictest.eq

fun <T> List<T>.any(predicate: (T) -> Boolean): Boolean =
    this.fold(false) { acc, el ->
        if (predicate(el)) true else acc
    }

fun main() {
    val list = listOf(1, -2, 3)
    list.any { it < 0 } eq true
}