package chapter3._03_01

fun returnsNothing() {
    println("\nreturnsNothing() function is called.")
}

fun main() {
    val bigger = 1000
    val smaller = 1
    // Won't compile since if EXPRESSIONS are better than ternary STATEMENTS
    // val max = bigger > smaller ? bigger : smaller
    val max = if (bigger > smaller) bigger else smaller
    println("The value of max is $max.")

    // Again, when EXPRESSION > switch STATEMENT
    val age = 35
    val boardGroup = when (age) {
        in 0..18 -> "family"
        in 65..200 -> "senior"
        else -> "regular"
    }
    println("\nYou are in the $boardGroup group.")

    val fromNothing = returnsNothing();
    println("The value assigned to fromNothing is $fromNothing.")

    val a = 100
    val b = 101
    // Won't compile assignments are statements
    // a = b = 98
}
