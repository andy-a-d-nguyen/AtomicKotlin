// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
    var count = 0
    var result = 0
    while (count <= n) {
        result += count
        count += 2
    }
    return result
}

fun main() {
    println(sumOfEven(10))  // 30
}