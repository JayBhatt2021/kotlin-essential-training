package chapter4._04_01

data class Student(val firstName: String, val grade: Int)

fun main() {
    // Kotlin Array Basics
    val things = arrayOf(1, 2, 3, "one", "two", "three")
    things[0] = "zero"
    println("The indices of the things array are ${things.indices} inclusive.")
    print("The following are the elements of the things array: ")
    for ((index, thing) in things.withIndex()) {
        if (index == things.lastIndex) {
            println(thing)
            break
        }
        print("$thing, ")
    }

    // Homogenous Object Arrays
    val students = arrayOf<Student>(Student("Todd", 6), Student("Vern", 5))
    students[1] = Student("Daisy", 7)
    print("\nThe following are the elements of the students array: ")
    for ((index, student) in students.withIndex()) {
        if (index == students.lastIndex) {
            println(student)
            break
        }
        print("$student, ")
    }

    // Array Initialization via the Array Constructor
    val fives = Array(5, ::fiver)
    print("\nThe following are the elements of the fives array: ")
    fives.forEach { element ->
        print("$element ")
    }

    // Various Array Properties
    println("\n\nThe fives array has ${fives.size} elements.")
    println("The indices of the fives array are ${fives.indices} inclusive.")
    println("The last index of the fives array is ${fives.lastIndex}.")

    // Kotlin Homogenous Primitive Arrays
    val pInts = intArrayOf(1, 2, 3)
    print("\nThe pInts integer array contains the following elements: ")
    pInts.forEach { element ->
        print("$element ")
    }
}

fun fiver(index: Int): Int {
    return index * 5;
}
