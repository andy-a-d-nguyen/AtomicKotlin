// Objects/Share2.kt
package objectshare2

import objectsharing.Shared
import objectshare1.f
import atomictest.eq

fun g() {
    Shared.i += 7
}

fun main() {
    f()
    g()
    Shared.i eq 12
}