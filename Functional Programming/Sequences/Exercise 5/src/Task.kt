// Sequences/Task5.kt
package sequencesExercise5

fun School.instructorsWithLargestClass(): Set<Instructor> {
    val maxClassSize = this.lessons
        .map { it.students.size }
        .maxOrNull()

    return this.lessons
        .filter { it.students.size == maxClassSize }
        .map { it.instructor }
        .toSet()
}