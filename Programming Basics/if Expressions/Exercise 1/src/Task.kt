// IfExpressions/Task1.kt
package ifExpressionsExercise1

fun checkSign(number: Int): String {
    if (number > 0) return "positive"
    else if (number < 0) return "negative"
    return "zero"
}

fun main() {
    println(checkSign(-19))  // negative
}