// Properties/Task4.kt
package propertiesExercise4

class Counter {
    var value = 0

    private val count = 10

    fun inc() {
        value += count
    }

    fun dec() {
        value -= count
    }
}