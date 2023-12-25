package chapter4._04_02

fun main() {
    // Initializing a Kotlin Read-only List and accessing its first element
    val names = listOf("Daisy", "Hattan", "Rob", "Chenni")
    println("The first element of names is ${names.get(0)}.")
    println("The first element of names is ${names[0]}.")

    // Demonstrating the subList method
    val subNames = names.subList(1, 3)
    println("\nThe subList from indices 1 (inclusive) to 3 (exclusive) is $subNames.")

    // Initializing a Kotlin Mutable List and modifying its first element
    val items = mutableListOf(2, 4, 6, 8, 10, 10, 10, 10, 14)
    items[0] = 1
    println("\nitems[0] = 1 sets the first item in the mutableList from 2 to ${items[0]}.")

    // Mutable List properties and methods
    items.add(12)
    println("\nitem.add(12) adds 12 to the end of the mutableList.")

    items.removeAt(3)
    println("items.removeAt(3) removes the fourth item (8) from the mutableList.")

    val removeBoolean: Boolean = items.remove(99)
    println("Was 99 removed from the mutableList? $removeBoolean")

    println("\nThe elements in items are $items.")

    println("There are ${items.size} elements in items.")

    println("The first element in items is ${items.first()}.")
}

