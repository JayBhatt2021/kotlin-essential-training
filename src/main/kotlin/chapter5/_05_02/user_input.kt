package chapter5._05_02
import java.util.Scanner

fun main() {
    // Basics of Obtaining User Input
    print("Enter text: ")
    val txt = readLine() ?: ""
    println("You entered: $txt, with its length = ${txt.length}.")

    // Reading an Integer
    print("\nEnter an Integer Value: ")
    val stringOne = readLine() ?: ""
    val integerValue: Int = stringOne.toIntOrNull() ?: 0
    println("You entered: $integerValue.")

    // Reading a Double
    print("\nEnter a Double Value: ")
    val stringTwo = readLine() ?: ""
    val doubleValue: Double = stringTwo.toDoubleOrNull() ?: 0.0
    println("You entered: $doubleValue.")

    scanner()
}

fun scanner() {
    // Receiving Number Inputs using a Scanner Object
    val scanner = Scanner(System.`in`)
    print("\nEnter an Integer Number: ")
    val numberOne = scanner.nextInt()
    print("Enter a Double Number: ")
    val numberTwo = scanner.nextDouble()

    // Printing the Aforementioned Number Inputs
    println("Your Integer Number is $numberOne, and your Double Number is $numberTwo.")
}
