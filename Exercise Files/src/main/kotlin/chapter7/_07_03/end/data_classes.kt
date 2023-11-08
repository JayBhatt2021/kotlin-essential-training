package chapter7._07_03.end

//class Student(val firstName: String, val lastName: String, val grade: Int) {
//    override fun toString(): String {
//        return "($firstName $lastName $grade)"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Student) {
//            return lastName == other.lastName &&
//                    firstName == other.firstName &&
//                    grade == other.grade
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        var result = firstName.hashCode()
//        result = 31 * result + lastName.hashCode()
//        result = 31 * result + grade
//        return result
//    }
//}

data class Student(val firstName: String, val lastName: String, val grade: Int)

fun main() {
    val students = mutableListOf<Student>(
        Student("abel", "baker", 11),
        Student("abel", "baker", 11),
        Student("delta", "echo", 12)
    )
    println()
    println(students[0])
    println("Does ${students[0]} == ${students[1]}: ${students[0] == students[1]}")

    val charlie = students[0].copy(firstName = "charlie")
    students.add(charlie)
    println()
    for(student in students){
        println(student)
    }
}
