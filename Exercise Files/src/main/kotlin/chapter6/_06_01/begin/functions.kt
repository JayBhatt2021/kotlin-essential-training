package chapter6._06_01.begin

fun main() {
    // Invoking a Basic Kotlin Function
    val greeting: String = greeter("Jay")
    val simpleGreeting: String = simpleGreeter("Jay")
    println("The standard Kotlin function returns \"$greeting\"")
    println("The one-line Kotlin function also returns \"$simpleGreeting\"")

    // Invoking a Function with a Rightmost Default Parameter
    println("\nThe volume is ${volume(10, 5)}.")

    // Showcasing Mandatory Named Arguments
    println("volumeX returns ${volumeX(width = 7, height = 13)}.")
}

// Basic Kotlin Function Declaration
fun greeter(name: String): String {
    return "Hello $name!"
}

// Simplified Function Declaration
fun simpleGreeter(name: String) = "Hello $name!"

// Showcasing a Function with a Rightmost Default Parameter
fun volume(length: Int, width: Int, height: Int = 10) = length * width * height

// When a default parameter is to the left of a non-default parameter, we can only use the default value by using
// named arguments.
fun volumeX(length: Int = 10, width: Int, height: Int) = length * width * height
