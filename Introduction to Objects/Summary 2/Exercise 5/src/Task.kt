// Summary2/Task5.kt
package summaryIIExercise5

fun va1(vararg ints: Int) {
    println("va1:")
    for (int in ints) println(int)
}

fun va2(vararg ints: Int) {
    println("va2:")
    va1(*ints)
}

fun main() {
    /*
      va1(1, 2, 3)
      va2(4, 5, 6)
    */
}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */