package chapter2._02_03.begin

fun firstOperand(): Boolean {
    println("firstOperand")
    return false;
}

fun secondOperand(): Boolean {
    println("secondOperand")
    return true;
}

fun main() {
    demoBoolean()
    demoChar()
}

private fun demoBoolean() {
    // Part One
    val willExercise = false
    println("willExercise = $willExercise")

    // Part Two
    val bigNumber = 1_000_000
    val smallNumber = 2
    println("bigNumber is bigger -> ${bigNumber > smallNumber}\n")

    // Part Three (Short Circuiting in Action)
    if (firstOperand() || secondOperand()) {
        println("At least one operand is true.\n")
    }

    if (firstOperand() && secondOperand()) {
        println("Both operands are true.\n")
    }

    // Part Four
    println("\nwillExercise = ${!willExercise}\n")
}

private fun demoChar() {
    // Part One
    val letter: Char = 'A'
    val tab = '\t'
    val infinity = '\u221E'

    println("letter = $letter")
    println("Tabbed|$tab|over")
    println("infinity = $infinity")

    // Part Two
    val lineFeed = 10.toChar()
    println("line feed =$lineFeed(10.toChar() indicates the next line in ASCII)")
}
