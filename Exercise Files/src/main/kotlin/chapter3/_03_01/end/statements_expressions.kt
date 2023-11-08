package chapter3._03_01.end

fun returnsNothing() {
    println("returnsNothing() function")
}

fun main() {
    val bigger = 1000
    val smaller = 1
    // Won't compile
    // val max = bigger > smaller? bigger: smaller
    //
    val max = if (bigger > smaller) bigger else smaller

    val age = 35
    val boardGroup = when (age) {
        in 0..18 -> "family"
        in 65..200 -> "senior"
        else -> "regular"
    }
    println("You are in the $boardGroup group.")

    val fromNothing = returnsNothing();
    println("$fromNothing")

    var a = 100
    var b = 101
    // Won't compile assignments are statements
    // a = b = 98
}
