package chapter5._05_01.begin

// Adding args to the main function
fun main(args: Array<String>) {
    // Accessing an element of args
    if (args.any()) {
        println("The first element of args (or the first command-line argument) is ${args[0]}.")
    }

    // Looping through the elements of args
    print("All of the command-line arguments: ")
    for (arg in args) {
        print("$arg ")
    }
    println()
}
