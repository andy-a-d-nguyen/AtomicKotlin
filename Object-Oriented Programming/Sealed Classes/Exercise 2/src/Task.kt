// SealedClasses/SealedEx2.kt
package sealedClassesExercise2

import sealedClassesExercise1.*
import atomictest.*

fun main() {
    Transport::class.sealedSubclasses.forEach { trace(it.simpleName) }
    trace eq """
        Train
        Bus
        Tram
        Plane
    """
}