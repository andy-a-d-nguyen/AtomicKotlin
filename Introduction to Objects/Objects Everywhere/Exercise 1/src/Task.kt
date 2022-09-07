// ObjectsEverywhere/Task1.kt
package objectsEverywhereExercise1

fun isPalindrome(s: String): Boolean = s == s.reversed()

fun main() {
    println(isPalindrome("mom"))     // true
    println(isPalindrome("street"))  // false
}