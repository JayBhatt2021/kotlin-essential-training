package chapter6._06_01

fun main() {
    // Invoking a basic Kotlin function:
    val greeting: String = greeter("Jay")
    val simpleGreeting: String = simpleGreeter("Jay")
    println("The standard Kotlin function returns \"$greeting\".")
    println("The one-line Kotlin function also returns \"$simpleGreeting\".")

    // Invoking a function with a rightmost default parameter:
    println("\nThe volume is ${volume(10, 5)} units^3.")

    // Showcasing mandatory named arguments:
    println("volumeX returns ${volumeX(width = 7, height = 13)} units^3.")
}

// Basic Kotlin Function Declaration
fun greeter(name: String): String {
    return "Hello $name!"
}

// Simplified Function Declaration
fun simpleGreeter(name: String) = "Hello $name!"

// Showcasing a function with a rightmost default parameter:
fun volume(length: Int, width: Int, height: Int = 10) = length * width * height

// When a default parameter is to the left of a non-default parameter,
// we can only use the default value by using named arguments.
fun volumeX(length: Int = 10, width: Int, height: Int) = length * width * height
