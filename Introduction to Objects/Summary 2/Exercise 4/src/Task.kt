// Summary2/Task4.kt
package summaryIIExercise4

import atomictest.capture
import atomictest.eq
import kotlin.IllegalArgumentException

class Dictionary {
    private val _translations = mutableMapOf<String, List<String>>()

    val translations: Map<String, List<String>>
        get() = _translations

    fun addTranslations(word: String, translations: String) {
        if (word in this.translations.keys)
            throw IllegalArgumentException("Dictionary already has translations for '$word'")
        val translationList = translations.split(" ")
        _translations[word] = translationList
    }
}

fun main() {
    val dictionary = Dictionary()
    dictionary.addTranslations("apple", "Apfel")
    dictionary.addTranslations("cake", "Kuchen Torte")

    dictionary.translations eq mapOf(
        "apple" to listOf("Apfel"),
        "cake" to listOf("Kuchen", "Torte")
    )

    capture {
        dictionary.addTranslations("cake", "Törtchen")
    } eq "IllegalArgumentException: Dictionary already has translations for 'cake'"

    // shouldn't compile:
//  dictionary.translations.remove("apple")
}