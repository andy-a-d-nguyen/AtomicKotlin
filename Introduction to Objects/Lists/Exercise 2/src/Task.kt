// Lists/Task2.kt
package listsExercise2

fun countOccurrences(list: IntList, number: Int): Int {
//  return list.count { it == number }
    if (list.size() == 0) return 0
    var count = 0
    for (e in list) if (e == number) count++
    return count
}

fun main() {
    val list = IntList(listOf(1, 2, 3, 2))
    println(countOccurrences(list, 2))  // 2
}