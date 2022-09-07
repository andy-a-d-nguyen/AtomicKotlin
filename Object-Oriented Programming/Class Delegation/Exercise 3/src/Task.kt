// ClassDelegation/Task3.kt
package classDelegationExercise3

import atomictest.*

interface A {
    fun foo()
    fun bar()
}

interface B {
    fun foo()
    fun baz()
}

class AA : A {
    override fun foo() = trace("A.foo()")
    override fun bar() = trace("A.bar()")
}

class BB : B {
    override fun foo() {
        trace("B.foo()")
    }

    override fun baz() {
        trace("B.baz()")
    }
}

class Delegation(val a: A, val b: B) :
    A by a, B by b {
    override fun foo() {
        a.foo()
        b.foo()
        trace("Delegation.foo()")
    }
}

fun main() {
    val d = Delegation(AA(), BB())
    d.foo()
    d.bar()
    d.baz()

    trace eq
            """
      AA.foo()
      BB.foo()
      Delegation.foo()
      AA.bar()
      BB.baz()
    """
}