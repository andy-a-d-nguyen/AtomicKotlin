// interoperability/ExtensionsToJavaClass.kt
package interop

import interoperability.Chameleon
import atomictest.eq

fun Chameleon.adjustToTemperature(
    isHot: Boolean
) {
    color = if (isHot) "grey" else "black"
}

fun main() {
    val chameleon = Chameleon()
    chameleon.size = 2
    chameleon.size eq 2
    chameleon.adjustToTemperature(isHot = true)
    chameleon.color eq "grey"
}