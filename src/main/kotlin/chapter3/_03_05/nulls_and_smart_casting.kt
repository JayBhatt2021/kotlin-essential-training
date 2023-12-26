package chapter3._03_05

data class Person(var firstName: String, var lastName: String)

fun main() {
    // You can't initialize a non-nullable variable with a null value:
    // val person1: Person = null
    val person2: Person? = null

    // Always check if a variable is null before using it:
    val greeting: String? = "Hello there!"
    if (greeting != null) {
        println("Joe says, \"$greeting\"")
    }

    // Showcasing the safe-call operator:
    println("\ngreeting?.length returns ${greeting?.length}.")

    // Showcasing the Elvis operator:
    val length = greeting?.length ?: 0
    println("\nThe value of length is $length.")

    // Showcasing the not-null assertion operator:
    val badLength = greeting!!.length
    println("\nThe value of badLength is $badLength.")

    // Showcasing the safe-cast operator:
    val safeGreeting: String? = greeting as? String
    println("\n\"$greeting\" (greeting) is safe-casted as a nullable String and assigned to safeGreeting.")
}
