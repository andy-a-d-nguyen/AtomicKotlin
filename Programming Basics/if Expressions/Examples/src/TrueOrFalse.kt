// IfExpressions/TrueOrFalse.kt

fun trueOrFalse(exp: Boolean): String {
    if (exp)
        return "It's true!"          // [1]
    return "It's false"            // [2]
}

fun main() {
    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >= 3))
}
/* Output:
It's true!
It's false
*/