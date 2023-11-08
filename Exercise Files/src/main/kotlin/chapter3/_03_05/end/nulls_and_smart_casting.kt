package chapter3._03_05.end

data class Person(var firstName: String, var lastName: String)

fun main() {
//    var person1: Person = null
    var person2: Person? = null

    val greeting: String? = "Hello there"
    if (greeting != null) {
        println("Joe says: '$greeting'")
    }

    println("greeting length = ${greeting?.length}")

    val len = greeting?.length ?: 0
    println("Length is $len")

    // exception when greeting is null
    val badLen = greeting!!.length

    val safeGreeting: String? = greeting as? String
}
