package chapter6._06_05

fun main() {
    // Function calling a defined lambda function:
    replicate { times, string ->
        for (index in 1..times)
            println(string)
    }
}

// Function that accepts a specific function:
fun replicate(func: (Int, String) -> Unit) {
    func(3, "Be Cool.")
}
