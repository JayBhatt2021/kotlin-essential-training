package chapter8._08_01.end

fun main() {
    val names = mutableListOf<String>()
    do {
        print("Enter a name (empty to end): ")
        val input = readLine()
        if (input.isNullOrEmpty()) break
        names.add(input)
    } while (true)

    println("\nWe have ${names.size} names")
    for (name in names) {
        println(name)
    }

    print("\nEnter first integer: ")
    val string1 = readLine() ?: ""
    val integer1: Int = string1.toIntOrNull() ?: 0

    print("\nEnter second integer: ")
    val string2 = readLine() ?: ""
    val integer2: Int = string2.toIntOrNull() ?: 0

    println("\n$integer1 * $integer2 = ${integer1 * integer2}")
}
