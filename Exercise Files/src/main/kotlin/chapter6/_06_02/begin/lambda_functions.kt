package chapter6._06_02.begin

fun main() {
    // Creating a Basic Lambda Function
    val lambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println("lambda(5, 10) returns ${lambda(5, 10)}.")

    // Making a Simplified Lambda Function
    val simpleLambda = { a: Int, b: Int -> a * b }
    println("\nsimpleLambda(5, 10) returns ${simpleLambda(5, 10)}.")
    println("simpleLambda.invoke(5, 10) also returns ${simpleLambda.invoke(5, 10)}.")

    // Using Trailing Lambdas with Collections
    val numList = listOf(1, 5, 7, 9, 10, 13)
    println("\nNumbers that are less than seven: ${numList.filter { it < 7 }}")

    // Extending an Existing Class with a Lambda
    val greet: String.() -> String = { "\nWhat's up, $this?" }
    println("Jay".greet())
}
