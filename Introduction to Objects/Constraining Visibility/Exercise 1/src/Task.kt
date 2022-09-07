// Visibility/Task1.kt
package constrainingVisibilityExercise1

class Alien(
    val name: String,
    val species: String,
    private var planet: String,
) {
    fun movePlanet(destination: String) {
        planet = destination
    }

    override fun toString(): String = "Alien $name, $species: $planet"
}

fun main() {
    val alien1 = Alien("Arthricia", "Cat Person", "PurgePlanet")
    alien1.movePlanet("Earth C-137")
    println(alien1.toString())

    val alien2 = Alien("Dale", "Giant", "Gearworld")
    alien2.movePlanet("Parblesnops")
    println(alien2.toString())
}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/