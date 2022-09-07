// ExceptionHandling/Task1.kt
package exceptionHandlingExercise1

import atomictest.trace
import kotlin.random.Random

data class Hamster(val name: String)

open class HamsterCageException(val msg: String) : Exception() {
    override fun toString(): String = "HamsterCageException: $msg"
}

class CageFullException(
    private val limit: Int
) : HamsterCageException("Cage full > $limit")

class NoSuchHamsterException(
    val id: String
) : HamsterCageException("No hamster $id")

class OutOfWaterException : HamsterCageException("Cage out of water")

class HamsterCage(private val capacity: Int) {
    private val rand = Random(47)
    private val cage = HashSet<Hamster>()

    fun add(h: Hamster) {
        if (cage.size > capacity) throw CageFullException(capacity)
        cage.add(h)
    }

    fun get(name: String): Hamster {
        cage.forEach { if (it.name == name) return it }
        throw NoSuchHamsterException(name)
    }

    fun feed(): String {
        val randomNumber = rand.nextInt(0, 10)
        if (randomNumber > 8) throw OutOfWaterException()
        return "Feeding Complete"
    }
}

val hamsters = listOf(
    Hamster("Sally"), Hamster("Ralph"),
    Hamster("Bob"), Hamster("Sergio"),
    Hamster("Allison"), Hamster("Jane")
)

fun test(hc: HamsterCage) {
    try {
        hamsters.forEach { trace(hc.add(it)) }
        trace(hc.get(hamsters.first().name))
        trace(hc.get("Morty"))
        trace(hc.feed())
        trace(hc.feed())
        trace(hc.feed())
    } catch (e: CageFullException) {
        trace(e)
    } catch (e: NoSuchHamsterException) {
        trace(e)
    } catch (e: OutOfWaterException) {
        trace(e)
    }
}

fun main() {
    test(HamsterCage(3))
    trace eq """
    Hamster(name=Sally)
    Hamster(name=Ralph)
    Hamster(name=Bob)
    Hamster(name=Sergio)
    HamsterCageException: Cage full > 3
    Hamster(name=Sally)
    HamsterCageException: No Hamster Morty
    Feeding complete
    HamsterCageException: Cage out of water
  """
}