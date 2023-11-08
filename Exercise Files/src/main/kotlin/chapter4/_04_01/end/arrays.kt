package chapter4._04_01.end

data class Student(val firstName: String, val grade: Int)

fun main() {
    val things = arrayOf(1, 2, 3, "one", "two", "three")
    things[0] = "zero"
    println("info = ${things.indices}")
    for (thing in things) {
        println(thing)
    }

    val students = arrayOf<Student>(Student("Todd", 6), Student("Vern", 5))
    students[1] = Student("Daisy", 7)
    for (student in students) {
        println(student)
    }

    val fives = Array(5, ::fiver)
    fives.forEach { println(it) }

    println("fives has ${fives.size} elements")
    println("indices = ${fives.indices} ")
    println("lastIndex = ${fives.lastIndex} ")

    val pInts = intArrayOf(1, 2, 3)
}

fun fiver(index: Int): Int{
    return index * 5;
}
