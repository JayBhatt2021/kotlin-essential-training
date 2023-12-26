package chapter3._03_03

enum class Suit {
    Club, Diamond, Heart, Spade
}

fun main() {
    // When-expressions - Basics
    val x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 3 or x == 4")
    }

    // The else-statement isn't required for the assignment variable
    // if the when-expression is exhaustive:
    val card = Suit.Spade
    val y = when (card) {
        Suit.Club, Suit.Spade -> println("\n$card is a black card.")
        Suit.Diamond, Suit.Heart -> println("\n$card is a red card.")
    }
    println("The value of y is $y.")

    // When-expressions don't have to compare only integers:
    val firstName = "Jay"
    val lastName = when (firstName) {
        "Bob" -> "Jones"
        "Michael" -> "Smith"
        "Jay" -> "Bhatt"
        else -> {
            "Unknown"
        }
    }
    println("\nYour name is $firstName $lastName.")

    // When-expressions - Ranges
    val ageType = when (x) {
        in 0..1 -> "baby"
        in 2..4 -> "toddler"
        in 5..12 -> "kid"
        in 13..19 -> "teenager"
        in 20..64 -> "adult"
        else -> "senior"
    }
    println("\nYou are a $ageType.")
}
