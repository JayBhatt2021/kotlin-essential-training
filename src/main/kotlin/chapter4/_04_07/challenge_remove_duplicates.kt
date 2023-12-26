package chapter4._04_07

fun main() {
    val animalList =
        listOf(
            "apple", "biscuit", "apple", "cat", "cat", "cat",
            "dog", "elephant", "fox", "goat", "elephant"
        )
    val animalSet = animalList.toSet()

    println("List with duplicates: $animalList")
    println("Set of the aforementioned list: $animalSet")
}
