// ExtensionLambdas/ExtensionLambdasSoln3.kt
package extensionLambdasExercise3

import atomictest.eq

open class Cleanser : ArrayList<String>() {
    fun selectContainer() {
        add("Container selected")
    }

    fun sealContainer() {
        add("Container sealed")
    }

    fun detergent() {
        add("detergent")
    }

    fun abrasive() {
        add("abrasive")
    }

    fun ammonia() {
        add("ammonia")
    }

    fun water() {
        add("water")
    }
}

class SprayCleanser : Cleanser() {
    fun selectSprayer() {
        add("Sprayer selected")
    }
}

fun cleanser(
    formula: Cleanser.() -> Unit
): Cleanser {
    val cleanser = Cleanser()
    cleanser.selectContainer()
    cleanser.formula()
    cleanser.sealContainer()
    return cleanser
}

fun sprayCleanser(
    formula: SprayCleanser.() -> Unit
): SprayCleanser {
    val sprayCleanser = SprayCleanser()
    sprayCleanser.selectContainer()
    sprayCleanser.selectSprayer()
    sprayCleanser.formula()
    sprayCleanser.sealContainer()
    return sprayCleanser
}

fun main() {
    val c: Cleanser = cleanser {
        detergent()
        abrasive()
    }
    c eq "[Container selected, detergent, " +
            "abrasive, Container sealed]"
    val sc: SprayCleanser = sprayCleanser {
        detergent()
        ammonia()
        water()
    }
    sc eq "[Container selected, " +
            "Sprayer selected, detergent, " +
            "ammonia, water, Container sealed]"
}