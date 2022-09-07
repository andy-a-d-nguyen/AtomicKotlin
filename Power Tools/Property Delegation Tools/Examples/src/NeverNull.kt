// DelegationTools/NeverNull.kt
package delegationtools

import atomictest.*
import kotlin.properties.Delegates

class NeverNull {
    var nn: Int by Delegates.notNull()
}

fun main() {
    val non = NeverNull()
    capture {
        non.nn
    } eq "IllegalStateException: Property " +
            "nn should be initialized before get."
    non.nn = 11
    non.nn eq 11
}