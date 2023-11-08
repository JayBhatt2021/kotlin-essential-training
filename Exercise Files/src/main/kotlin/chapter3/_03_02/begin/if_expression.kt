package chapter3._03_02.begin

fun main() {
    // Proper Way to Assign an If-Expression to a Variable
    val bigger = 101
    val smaller = 1
    val max = if (bigger > smaller) bigger else smaller
    println("The value of max is $max.")

    // If test cases overlap, the first conditional match wins!
    if (bigger > 10) {
        println("\nThe value of bigger is greater than 10!")
    } else if (bigger > 100) {
        println("\nThe value of bigger is greater than 100!")
    } else {
        println("\nThe value of bigger is not too big.")
    }

    // If-expression can return values of different types.
    // If this is the case, make your assignment variable of type Any.
    val number = 121
    val bucket: Any = if (number > 100) {
        println("\nThe value of number is greater than 100!")
        "alpha"
    } else if (number > 90) {
        println("\nThe value of number is 91 - 100 inclusive")
        2
    } else if (number > 80) {
        println("\nThe value of number is 81 - 90 inclusive.")
    } else {
        println("\nThe value of number is 80 or less.")
        1
    }
    println("The value of the bucket assignment variable is $bucket.")

    // Don't redundantly return booleans from if-expressions.
    // val isGreater = if (number > 100) true else false
    val isGreater2 = number > 100
    println("\nIs $number greater than 100? $isGreater2")
}
