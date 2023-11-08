package chapter2._02_03.end

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
//    demoChar()
}

private fun demoBoolean() {
    var willExercise = false
    val bigNumber = 1_000_000
    val smallNumber = 2
    println("is big bigger = ${bigNumber > smallNumber}")

    if(firstOperand() || secondOperand()) {
        println("at least one operand is true")
    }

    if(firstOperand() && secondOperand()) {
        println("Both operands are true")
    }

    println("Will exercise = ${!willExercise}")
}

private fun demoChar() {
    val letter: Char = 'A'
    val tab = '\t'
    val infinity = '\u221E'

    println("letter = $letter")
    println("Tabbed $tab over")
    println("infinity = $infinity")

    val lineFeed = 10.toChar()
    println("line feed = $lineFeed next line")
}
