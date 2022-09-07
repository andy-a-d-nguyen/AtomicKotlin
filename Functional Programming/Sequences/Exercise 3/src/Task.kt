// Sequences/Task3.kt
package sequencesExercise3

fun School.averageInstructorRating(instructor: Instructor): Double =
    this.lessons
        .filter { it.instructor == instructor }
        .flatMap { it.rating.values.asSequence() }
        .average()