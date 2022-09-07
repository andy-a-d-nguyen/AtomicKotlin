// ResourceCleanup/ResourceCleanupSoln3.kt
package resourceCleanupExercise3

import atomictest.capture
import atomictest.trace
import resourceCleanupExercise3.Option.*

class Cleanup : AutoCloseable {
    fun f() = trace("f()")
    fun g() = trace("g()")
    fun h() = trace("h()")
    override fun close() = trace("close()")
}

enum class Option { Normal, Return, Throw }

fun verifyClose(opt: Option) {
    Cleanup().use {
        it.f()
        when (opt) {
            Normal -> it.g()
            Return -> return
            Throw -> throw Exception()
        }
        it.h()
    }
}

fun main() {
    verifyClose(Normal)
    verifyClose(Return)
    capture {
        verifyClose(Throw)
    } eq "Exception"
    trace eq """
    f()
    g()
    h()
    close()
    f()
    close()
    f()
    close()
  """
}