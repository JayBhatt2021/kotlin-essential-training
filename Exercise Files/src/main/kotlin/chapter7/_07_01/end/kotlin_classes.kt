package chapter7._07_01.end

class PlainShort {}

class ShortClass

class WithConstructor constructor(name: String, age: Int) {}

class WithoutConstructor (name: String, age: Int) {}

class MandatoryConstructor internal constructor(name: String, age: Int) {}

class CourseProperty(courseTitle: String) {
    val title = courseTitle
}

class Person(val firstName: String, lastName: String, var age: Int) {}

class Course(courseTitle: String) {
    private val title = courseTitle
    internal var description = ""
    get(){
        return if(field.isNullOrBlank()) "no description" else "$field!"
    }

    fun show() {
        println(title)
    }

//    override fun toString(): String {
//        return "$title - $description"
//    }
}

fun main() {
    val course = Course("Kotlin Essential Training")
    course.description = "secrets you want to know"
    course.show()
    println(course)
}
