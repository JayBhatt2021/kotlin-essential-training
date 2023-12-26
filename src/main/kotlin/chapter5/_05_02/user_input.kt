package chapter5._05_02
import java.util.Scanner

fun main() {
    // Basics of obtaining user input
    print("Enter text: ")
    val txt = readlnOrNull() ?: ""
    println("You entered: \"$txt\", with its length = ${txt.length}.")

    // Reading an integer:
    print("\nEnter an integer value: ")
    val stringOne = readlnOrNull() ?: ""
    val integerValue: Int = stringOne.toIntOrNull() ?: 0
    println("You entered: $integerValue.")

    // Reading a double:
    print("\nEnter a double value: ")
    val stringTwo = readlnOrNull() ?: ""
    val doubleValue: Double = stringTwo.toDoubleOrNull() ?: 0.0
    println("You entered: $doubleValue.")

    scanner()
}

fun scanner() {
    // Receiving number inputs using a Scanner object:
    val scanner = Scanner(System.`in`)
    print("\nEnter an integer number: ")
    val numberOne = scanner.nextInt()
    print("Enter a double number: ")
    val numberTwo = scanner.nextDouble()

    // Printing the aforementioned number inputs:
    println("Your integer number is $numberOne, and your double number is $numberTwo.")
}
