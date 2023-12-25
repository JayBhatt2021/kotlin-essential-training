package chapter2._02_01

fun main() {
    // Part One
    var count: Int = 0
    val number: Int = -2147483648
    val otherNumber = 2147483647

    println("The current count is $count.")
    count++
    println("Now the current count is $count.")
    println("\nThe Int variable ranges from $number to $otherNumber.")

    // Part Two
    val myLong: Long = 300000000000L
    val myByte: Byte = -128
    val myShort: Short = 32767

    println("\nThe value of myLong is $myLong.")
    println("The value of myByte is $myByte.")
    println("The value of myShort is $myShort.")

    // Part 3
    val myDouble: Double = 98.6
    val myFloat: Float = 12.2F
    val alsoDouble = 101.5

    println("\nThe value of myDouble is $myDouble.")
    println("The value of myFloat is $myFloat.")
    println("The value of alsoDouble is $alsoDouble.")

    val asInt = alsoDouble.toInt()
    val asFloat = myLong.toFloat()

    println("\nUsing toInt() on alsoDouble produces $asInt.")
    println("Using toFloat() on myLong produces $asFloat.")

    // Part 4
    val maxInt = 2_147_483_648

    println("\nThe values of large numbers such as $maxInt can be delimited via underscores in Kotlin.")
}
