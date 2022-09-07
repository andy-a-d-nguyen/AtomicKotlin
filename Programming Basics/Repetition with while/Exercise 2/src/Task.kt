// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
    var count = 0
    var result = 0
    while (count <= number) {
        result += count
        count++
    }
    return result
}

fun main() {
    println(sum(10))  // 55
}