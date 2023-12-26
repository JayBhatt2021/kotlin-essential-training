package chapter3._03_06

fun main() {
    // Determines card points and level
    var cardPoints = 7_000
    val cardLevel: String = when (cardPoints) {
        in 0..999 -> "pearl"
        in 1_000..4_999 -> "silver"
        in 5_000..9_999 -> "gold"
        else -> "platinum"
    }

    // Determines point plurality and print-statement syntax
    val plural: String = if (cardPoints == 1) "" else "s"
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}
