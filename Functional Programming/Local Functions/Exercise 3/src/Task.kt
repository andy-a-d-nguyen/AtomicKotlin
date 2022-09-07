// LocalFunctions/Task3.kt
package localFunctionsExercise3

import atomictest.eq

fun createContainer(): Pair<(Int) -> Unit, () -> Int?> {
    var container: Int? = null

    fun add(num: Int) {
        container = num
    }

    fun remove(): Int? {
        val result = container
        container = null
        return result
    }

    return Pair(::add, ::remove)
}

fun main() {
    val (add, remove) = createContainer()
    add(42)
    remove() eq 42
    remove() eq null
    add(121)
    remove() eq 121
}