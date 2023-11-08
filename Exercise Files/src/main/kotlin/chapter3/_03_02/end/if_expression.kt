package chapter3._03_02.end

fun main() {
    val bigger = 100
    val smaller = 1
    val max = if (bigger > smaller) bigger else smaller

    if (bigger > 10) {
        println("Greater than 10!")
    } else if (bigger > 100) {
        println("Greater than 100!")
    } else {
        println("Not too big")
    }

    val number = 121
    val bucket: Any = if (number > 100) {
        "alpha"
    } else if (number > 90) {
        println("Less than 90")
        2
    } else if (number > 80) {
        println("Less than 80")
    } else {
        1
    }
    println("bucket = $bucket")

    val isGreater = if (number > 100) true else false
    val isGreater2 = number > 100

    println("Is $number greater than 100? $isGreater2")
}
