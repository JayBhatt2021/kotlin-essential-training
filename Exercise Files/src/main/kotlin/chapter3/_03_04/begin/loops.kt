package chapter3._03_04.begin

fun main() {
    //    Traditional C-style loop
    //    for (int i = 0; i < 10; i++) {
    //        println("i = $i")
    //    }

    println("Range-focused for-loop:")
    for (i in 1..10) {
        println("i = $i")
    }

    val students = listOf("Janet", "Daisy", "Veronica", "Fernanda")
    println("\nIterating through a collection with a for-loop:")
    for (student in students) {
        println("The current student is $student.")
    }

    println("\nUsing withIndex() to access loop indices and collection values")
    for ((index, student) in students.withIndex()) {
        println("Student #${index + 1}): $student")
    }

    println("\nWhile Loop (5 -> 1):")
    var count = 5
    while (count > 0) {
        println("While Count = $count")
        count--
    }
    println("Current count (outside while): $count")

    println("\nDo-while Loop (0 -> 4):")
    do {
        println("Do-while Count = $count")
        count++
    } while (count < 5)
    println("Current count (outside do-while): $count")

    println("\nDemonstration of the break and continue statement:")
    while (count > 0) {
        if (count % 6 == 0) {
            count++
            continue
        }
        else if (count == 9) break
        println("Second While Count = $count")
        count++
    }
}
