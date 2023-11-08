package chapter6._06_02.end

fun main() {
    val lam: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println("Sum = ${lam(5, 10)}")

    val l = { a: Int, b: Int -> a * b }
    println("5 * 10 = ${l(5, 10)}")
    println("10 * 50 = ${l.invoke(10, 50)}")

    val num = listOf(1, 5, 7, 9, 10, 13)
    println(num.filter { it < 7})

    val greet: String.() -> String = { "What's up $this?"}
    println("Troy".greet())
}
