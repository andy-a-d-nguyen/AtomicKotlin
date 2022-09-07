// InKeyword/Task4.kt
package theInKeywordExercise4


fun isValidCharacter(c: Char): Boolean =
    c == '_' ||
            c in 'a'..'z' ||
            c in 'A'..'Z' ||
            c in '0'..'9'

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || s[0] in '0'..'9') return false
    for (c in s) {
        if (!isValidCharacter(c)) return false
    }
    return true
}

fun main() {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name"))  // false
}