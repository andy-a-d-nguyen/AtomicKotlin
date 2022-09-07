// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

import kotlin.reflect.typeOf

fun f(first: Int, second: Int) = first + second

fun g(first: String, second: String) = first + second

fun h() = println("h()")

fun main() {
    val fResult: Int = f(1, 2)
    val gResult: String = g("1", "2")
    val hResult: Unit = h()
    println("Int")
    println("String")
    println("Unit")
}