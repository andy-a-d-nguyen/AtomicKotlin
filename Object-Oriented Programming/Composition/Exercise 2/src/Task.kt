// Composition/Task2.kt
package compositionExercise2

import atomictest.*

class Stack<E> {
    private val arrayList = arrayListOf<E>()
    fun push(e: E) = arrayList.add(e)
    fun pop(): E = arrayList.removeLast()
}

class Queue<E> {
    private val arrayList = arrayListOf<E>()
    fun put(e: E) = arrayList.add(e)
    fun poll(): E = arrayList.removeFirst()
}

fun main() {
    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.pop() eq 4
    stack.pop() eq 3

    val queue = Queue<String>()
    queue.put("a")
    queue.put("b")
    queue.put("c")
    queue.put("d")
    queue.poll() eq "a"
    queue.poll() eq "b"
}