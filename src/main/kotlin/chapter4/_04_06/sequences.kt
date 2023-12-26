package chapter4._04_06

fun main() {
    // Converting a collection to a sequence:
    val result = (100 until 200).asSequence()
        .map { println("Doubling $it"); it * 2 }
        .filter { println("Filtering $it"); it % 3 == 0 }
        .first()
    println("The result is $result.")

    // Sequences require terminal operations:
    val myThrees = sequenceOf(1, 3, 5, 7, 9)
        .filter {
            it % 3 == 0
        }
    println("\nNot putting a terminal operation for the myThrees sequence yields \"$myThrees\".")
    println("Using the toList() terminal operation for the myThrees sequence yields \"${myThrees.toList()}\".")
}
