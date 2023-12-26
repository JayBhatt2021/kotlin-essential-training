package chapter7._07_03

// Data Transfer Object
/*
class Student(val firstName: String, val lastName: String, val grade: Int) {
    override fun toString(): String {
        return "($firstName $lastName $grade)"
    }

    // Determines Student object equality:
    override fun equals(other: Any?): Boolean {
        // Checks to see if the other object is a Student object:
        if (other is Student) {
            // Compares the properties of both of the Student objects:
            return (firstName == other.firstName) && (lastName == other.lastName) && (grade == other.grade)
        }
        return false
    }

    // IntelliJ-generated hashCode Method
    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + grade
        return result
    }
}
*/

// The Actual Data Class
data class Student(val firstName: String, val lastName: String, val grade: Int)

fun main() {
    val students = mutableListOf<Student>(
        Student("Abel", "Baker", 11),
        Student("Abel", "Baker", 11),
        Student("Delta", "Echo", 12)
    )

    // Printing and observing the equality between two Student objects:
    println("First Student: ${students[0]}")
    println("Does ${students[0]} equal ${students[1]}? ${students[0] == students[1]}\n")

    // Copying and modifying a Student object:
    val charlie = students[0].copy(firstName = "Charlie")

    // Adding the new Student object to the list and printing the list out:
    students.add(charlie)
    println("Students in the List (after adding Charlie Baker):")
    for (student in students) {
        println(student)
    }
}
