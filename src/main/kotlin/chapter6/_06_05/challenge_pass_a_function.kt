package chapter6._06_05

fun main() {
    // Function Calling a Defined Lambda Function
    replicate { times, string ->
        for (index in 1..times)
            println(string)
    }
}

// Function that Accepts a Specific Function
fun replicate(func: (Int, String) -> Unit) {
    func(3, "Be Cool.")
}
