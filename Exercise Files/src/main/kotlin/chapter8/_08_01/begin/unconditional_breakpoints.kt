package chapter8._08_01.begin

fun main() {
    // Stores a List of Names
    val names = mutableListOf<String>()

    // Adds Names to the List until an Empty String Is Inputted
    do {
        print("Enter a name (empty to end): ")
        val input = readLine()
        if (input.isNullOrEmpty()) break
        names.add(input)
    } while (true)


    // Displays the Number of Names in the List
    println("\nWe have ${names.size} name(s).")

    // Prints all the Names in the List
    println("Names:")
    for (name in names) {
        println(name)
    }

    // Obtains the First User-Inputted Integer (Zero if Invalid Input)
    print("\nEnter first integer: ")
    val string1 = readLine() ?: ""
    val integer1: Int = string1.toIntOrNull() ?: 0

    // Obtains the Second User-Inputted Integer (Zero if Invalid Input)
    print("Enter second integer: ")
    val string2 = readLine() ?: ""
    val integer2: Int = string2.toIntOrNull() ?: 0

    // Prints the Product of the Previous Two Integers
    println("\n$integer1 * $integer2 = ${integer1 * integer2}")
}
