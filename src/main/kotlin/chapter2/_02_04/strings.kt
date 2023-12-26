package chapter2._02_04

fun main() {
    // Part One
    val greeting = "Hello there!"
    println(greeting)

    val owe = 50
    val janet = "I owe Janet \$$owe dollars."
    println(janet)

    // Part Two
    val infinity = "\nThe infinity symbol is \u221E."
    println(infinity)

    // Part Three
    println("\n\"$greeting\" contains ${greeting.length} characters.")

    val bad = greeting.get(2)
    val moreConcise = greeting[0]
    println("\ngreeting.get(2) returns '$bad', and greeting[0] returns '$moreConcise'.")
    println("Use bracket notation rather than the String get method.")

    val compare1 = "beta"
    val compare2 = "alpha"
    println(
        "\n\"$compare1\".compareTo(\"$compare2\") returns ${compare1.compareTo(compare2)} since beta comes after " +
                "alpha in the alphabet."
    )

    val sub = greeting.subSequence(6, 9)
    println("\ngreeting.subSequence(6, 9) produces \"$sub\".")

    // Part Four
    print("\nString are iterable objects and can be used in loops: ")
    for (singleChar in greeting) {
        print("$singleChar ")
    }

    // Part Five
    val myString = """
    Kotlin is fun.
    Kotlin is pragmatic.
    """
    println("\nThe following is a raw string in Kotlin: $myString")
}
