// Objects/ObjectEx1.kt
package objectsExercise1

import atomictest.*

private fun f() = trace("f() $p")
private const val p = "p"

object Space {
    fun f() = trace("Space.f() $p")
    private const val p = "Space.p"
}

private object Space2 {
    fun f() = trace("Space2.f() $p")
    private const val p = "Space2.p"
}

fun main() {
    f()
    Space.f()
    Space2.f()
    trace eq """
    f() p
    Space.f() Space.p
    Space2.f() Space2.p
  """
}