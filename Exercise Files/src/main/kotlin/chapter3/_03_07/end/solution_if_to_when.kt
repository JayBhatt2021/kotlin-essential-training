package chapter3._03_07.end

fun main() {
    var cardPoints = 4500

    val cardLevel: String = when(cardPoints) {
        in 0..999 -> "pearl"
        in 1000..4999 -> "silver"
        in 5_000..9999 -> "gold"
        else -> "platinum"
    }

    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}
