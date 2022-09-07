// ResourceCleanup/ForEachLine.kt
import checkinstructions.DataFile
import atomictest.*

fun main() {
    DataFile("Results.txt").forEachLine {
        if (it.startsWith("#"))
            trace("$it")
    }
    trace eq "# ok"
}