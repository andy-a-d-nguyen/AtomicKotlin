// CompanionObjects/CompanionEx1.kt
package companionObjectsExercise1

import atomictest.trace

interface Vendor {
    fun pencil()
    fun pen()
}

interface VendorFactory {
    fun create(): Vendor
}

class Vendor1 : Vendor {
    companion object {
        val factory = object : VendorFactory {
            override fun create(): Vendor = Vendor1()
        }
    }

    override fun pencil() = trace("${this.javaClass.simpleName} pencil")
    override fun pen() = trace("${this.javaClass.simpleName} pen")
}

class Vendor2 : Vendor {
    companion object {
        val factory = object : VendorFactory {
            override fun create(): Vendor = Vendor2()
        }
    }

    override fun pencil() = trace("${this.javaClass.simpleName} pencil")
    override fun pen() = trace("${this.javaClass.simpleName} pen")
}

fun consumer(factory: VendorFactory) {
    val vendor = factory.create()
    vendor.pencil()
    vendor.pen()
}

fun main() {
// Implementations are interchangeable:
    consumer(Vendor1.factory)
    consumer(Vendor2.factory)
    trace eq """
  Vendor1 pencil
  Vendor1 pen
  Vendor2 pencil
  Vendor2 pen
  """

}