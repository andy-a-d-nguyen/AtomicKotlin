// interoperability/PlatformTypes.kt
package interop

import interoperability.JTool
import atomictest.eq

object KotlinCode {
    val a: JTool? = JTool.get("")  // [1]
    val b: JTool = JTool.get("")   // [2]
    val c = JTool.get("")          // [3]
}

fun main() {
    with(KotlinCode) {
        a?.method() eq "Success"     // [4]
        b.method() eq "Success"
        c.method() eq "Success"      // [5]
        ::a.returnType eq
                "interoperability.JTool?"
        ::b.returnType eq
                "interoperability.JTool"
        ::c.returnType eq
                "interoperability.JTool!"  // [6]
    }
}