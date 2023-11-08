package chapter6._06_03.end

fun main() {
    val num = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    val fNum = num.filter(fun(a: Int): Boolean { return a < 7 })
    println(fNum)
    val fNum2 = num.filter(fun(a) = a < 7)
    println(fNum2)

    println()
    val getAge2 = lambda@{ age: Int ->
        if(age >= 65)
            return@lambda "senior discount"
        else if(age >= 21)
            return@lambda "regular"
        "underage"
    }
    println("Client pays ${getAge2(32)} price")

    println()
    val getAge = fun(age: Int):String {
        if(age >= 65)
            return "senior discount"
        else if(age >= 21)
            return "regular"
        return "underage"
    }
    println("Client pays ${getAge(70)} price")

}
