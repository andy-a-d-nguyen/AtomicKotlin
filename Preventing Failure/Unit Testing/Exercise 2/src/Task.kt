// Tests/unittesting/UnitTestingSoln2.kt
package unitTestingExercise2

import interfaces.DeepThought
import interfaces.Desktop
import interfaces.Quantum
import kotlin.test.Test
import kotlin.test.assertEquals

class DesktopTest {
    private val desktop = Desktop()

    @Test
    fun prompt() {
        assertEquals("Hello!", desktop.prompt())
    }

    @Test
    fun calculateAnswer() {
        assertEquals(11, desktop.calculateAnswer())
    }
}

class DeepThoughtTest {
    private val deepThought = DeepThought()

    @Test
    fun prompt() {
        assertEquals("Thinking...", deepThought.prompt())
    }

    @Test
    fun calculateAnswer() {
        assertEquals(42, deepThought.calculateAnswer())
    }
}

class QuantumTest {
    private val quantum = Quantum()

    @Test
    fun prompt() {
        assertEquals("Probably...", quantum.prompt())
    }

    @Test
    fun calculateAnswer() {
        assertEquals(-1, quantum.calculateAnswer())
    }
}