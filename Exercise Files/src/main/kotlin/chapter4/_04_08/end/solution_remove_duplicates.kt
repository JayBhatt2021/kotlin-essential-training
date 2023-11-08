package chapter4._04_08.end

fun main() {
    val animals =
        listOf("apple", "biscuit", "apple", "cat", "cat", "cat",
            "dog", "elephant", "fox", "goat", "elephant")
    val setAnimals = animals.toSet()
    println(setAnimals)
}
