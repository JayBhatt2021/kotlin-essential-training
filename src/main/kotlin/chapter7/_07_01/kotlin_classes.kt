package chapter7._07_01

// Basic Class Definition
class BasicClass {}

// Shorter (but dubious) Class Definition
class ShortClass

// Class with a Primary Constructor
class WithPrimaryConstructor constructor(name: String, age: Int) {}

// Shorter Primary Constructor Definition (only with public constructors)
class ShortPrimaryConstructor(name: String, age: Int) {}

// Primary Constructor with an Internal Visibility Modifier (constructor callable only in the same file)
class InternalPrimaryConstructor internal constructor(name: String, age: Int) {}

// Primary Constructor with a Class Property (named differently from parameter)
class CourseProperty(courseTitle: String) {
    val title = courseTitle
}

// Class Property Shortcuts
// firstName == immutable property (val)
// lastName != property (no val/var keyword in the constructor AND no assignment statement in the class)
// age == mutable property (var)
class Person(val firstName: String, lastName: String, var age: Int) {}

// Class with a Getter
class Course(courseTitle: String) {
    private val title = courseTitle
    internal var description = ""
        get() {
            return if (field.isBlank()) "no description" else "$field!"
        }

    // Member Function
    fun show() {
        println(title)
    }

    // Overridden toString Function
    override fun toString(): String {
        return "$title - $description"
    }
}

fun main() {
    val course = Course("Kotlin Essential Training")
    course.description = "The Basics of Kotlin"

    print("Course Title: ")
    course.show()
    println("The overridden toString function allows println(course) to print \"${course}\".")
}
