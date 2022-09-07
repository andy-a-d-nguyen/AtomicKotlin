// ManipulatingLists/Task1.kt
package manipulatingListsExercise1

import atomictest.eq

fun <T> List<T>.zipWithIndex(): List<Pair<T, Int>> {
//    this.zip(this.indices)
    val result = mutableListOf<Pair<T, Int>>()
    for ((index, element) in this.withIndex()) {
        result.add(Pair(element, index))
    }
    return result
}

fun main() {
    val list = listOf('a', 'b', 'c')
    list.zipWithIndex() eq
            "[(a, 0), (b, 1), (c, 2)]"
}