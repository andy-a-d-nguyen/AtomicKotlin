// ClassDelegation/ModelingMI.kt
package classdelegation

import atomictest.eq

interface Rectangle {
    fun paint(): String
}

class ButtonImage(
    val width: Int,
    val height: Int
) : Rectangle {
    override fun paint() =
        "painting ButtonImage($width, $height)"
}

interface MouseManager {
    fun clicked(): Boolean
    fun hovering(): Boolean
}

class UserInput : MouseManager {
    override fun clicked() = true
    override fun hovering() = true
}

// Even if we make the classes open, we
// get an error because only one class may
// appear in a supertype list:
// class Button : ButtonImage(), UserInput()

class Button(
    val width: Int,
    val height: Int,
    var image: Rectangle =
        ButtonImage(width, height),
    private var input: MouseManager = UserInput()
) : Rectangle by image, MouseManager by input

fun main() {
    val button = Button(10, 5)
    button.paint() eq
            "painting ButtonImage(10, 5)"
    button.clicked() eq true
    button.hovering() eq true
    // Can upcast to both delegated types:
    val rectangle: Rectangle = button
    val mouseManager: MouseManager = button
}