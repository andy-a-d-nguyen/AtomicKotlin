// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

import creatinggenerics.c

fun displayContent(s: String) {
    var length = 0
    var content = ""
    while (length < s.length) {
        content += s[length] + "\n"
        length++
    }
    println(content)
}

fun main() {
//  displayContent("abc")
}
/* Expected output:
a
b
c
*/