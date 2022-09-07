// Testing/Task3.kt
package testingExercise3

import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int) = (x + y) / 2.0 * h

fun main() {
    squareArea(1) eq 1
    squareArea(2) eq 4
    squareArea(5) eq 25

    rectangleArea(2, 3) eq 6
    rectangleArea(3, 3) eq 9
    rectangleArea(5, 4) eq 20

    trapezoidArea(2, 2, 2) eq 4
    trapezoidArea(4, 2, 3) eq 9
    trapezoidArea(3, 5, 2) eq 8
}