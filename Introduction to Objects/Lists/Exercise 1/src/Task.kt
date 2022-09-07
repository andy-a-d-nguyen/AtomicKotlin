// Lists/Task1.kt
package listsExercise1

import atomictest.eq

fun findMax(list: IntList): Int {
//  return list.maxOrNull() ?: 0
    if (list.size() == 0) return 0
    var result = 0
    for (e in list) if (e > result) result = e
    return result
}

fun main() {
    val list = IntList(listOf(1, 2, 3, 2))
    findMax(list) eq 3
}