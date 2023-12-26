package chapter8._08_01

fun main() {
    // Stores a list of names:
    val names = mutableListOf<String>()

    // Adds names to the list until an empty string is inputted:
    do {
        print("Enter a name (empty to end): ")
        val input = readlnOrNull()
        if (input.isNullOrEmpty()) break
        names.add(input)
    } while (true)


    // Displays the number of names in the list:
    println("\nWe have ${names.size} name(s).")

    // Prints all the names in the list:
    println("Names:")
    for (name in names) {
        println(name)
    }

    // Obtains the first user-inputted integer (zero if invalid input):
    print("\nEnter first integer: ")
    val string1 = readlnOrNull() ?: ""
    val integer1: Int = string1.toIntOrNull() ?: 0

    // Obtains the second user-inputted integer (zero if invalid input):
    print("Enter second integer: ")
    val string2 = readlnOrNull() ?: ""
    val integer2: Int = string2.toIntOrNull() ?: 0

    // Prints the product of the previous two integers
    println("\n$integer1 * $integer2 = ${integer1 * integer2}")
}
