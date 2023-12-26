package chapter3._03_01

fun returnsNothing() {
    println("\nreturnsNothing() is called.")
}

fun main() {
    val bigger = 1000
    val smaller = 1
    // The following won't compile since if EXPRESSIONS are better than ternary STATEMENTS.
    // val max = bigger > smaller ? bigger : smaller
    val max = if (bigger > smaller) bigger else smaller
    println("The value of max is $max.")

    // Again, when EXPRESSIONS > switch STATEMENTS.
    val age = 35
    val boardGroup = when (age) {
        in 0..18 -> "family"
        in 65..200 -> "senior"
        else -> "regular"
    }
    println("\nYou are in the $boardGroup group.")

    val fromNothing = returnsNothing()
    println("The value assigned to fromNothing is $fromNothing.")

    val a = 100
    val b = 101
    // This won't compile as assignments are statements.
    // a = b = 98
}
