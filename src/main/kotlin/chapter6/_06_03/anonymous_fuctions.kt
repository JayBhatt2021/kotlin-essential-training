package chapter6._06_03

fun main() {
    // Creating a basic anonymous function:
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    val filteredNumberList = numberList.filter(fun(a: Int): Boolean { return a < 7 })
    println("filteredNumberList contains $filteredNumberList.")

    // Making a simplified anonymous function:
    val filteredNumberList2 = numberList.filter(fun(a) = a < 7)
    println("filteredNumberList2 also contains $filteredNumberList2.")

    // If we have multiple return statements, anonymous functions > lambdas.
    // Lambda Version
    val lambdaGetAge = lambda@{ age: Int ->
        if (age >= 65)
            return@lambda "senior discount"
        else if (age >= 21)
            return@lambda "regular"
        "underage"
    }
    println("\nlambdaGetAge(32) produces \"${lambdaGetAge(32)}\".")

    // Anonymous Function Version
    val anonymousFunctionGetAge = fun(age: Int): String {
        if (age >= 65)
            return "senior discount"
        else if (age >= 21)
            return "regular"
        return "underage"
    }
    println("anonymousFunctionGetAge(70) produces \"${anonymousFunctionGetAge(70)}\".")
}
