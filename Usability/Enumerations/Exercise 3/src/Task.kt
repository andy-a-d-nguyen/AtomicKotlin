// Enumerations/Task3.kt
package enumerationsExercise3

import atomictest.eq
import enumerationsExercise3.Result.*
import enumerationsExercise3.Rochambeau.*

enum class Rochambeau {
    ROCK, PAPER, SCISSORS
}

enum class Result {
    DRAW, FIRST_WINS, SECOND_WINS
}

fun winner(first: Rochambeau, second: Rochambeau) = when (first) {
    ROCK -> when (second) {
        ROCK -> DRAW
        PAPER -> SECOND_WINS
        SCISSORS -> FIRST_WINS
    }

    PAPER -> when (second) {
        ROCK -> FIRST_WINS
        PAPER -> DRAW
        SCISSORS -> SECOND_WINS
    }

    SCISSORS -> when (second) {
        ROCK -> SECOND_WINS
        PAPER -> FIRST_WINS
        SCISSORS -> DRAW
    }
}

fun main() {
    winner(ROCK, SCISSORS) eq FIRST_WINS
    winner(SCISSORS, ROCK) eq SECOND_WINS
    winner(PAPER, PAPER) eq DRAW
}