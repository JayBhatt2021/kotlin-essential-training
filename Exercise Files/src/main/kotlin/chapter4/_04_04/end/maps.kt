package chapter4._04_04.end

fun main() {
    val m1 = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma", 4 to "delta")
    val m2 = mapOf(4 to "delta", 3 to "gamma", 2 to "beta", 1 to "alpha")
    println("m1 == m2? ${m1 == m2}")

    println("m1[2] = ${m1[2]}")
    println("m1[5] = ${m1.getOrDefault(5, "Not present")}")

    println()
    val cars = mutableMapOf(
        "ford" to 1903, "gm" to 1908,
        "dodge" to 1913, "tucker" to 1944
    )
    cars["tesla"] = 2003
    println("removed tucker = ${cars.remove("tucker")}")
    for (key in cars.keys) {
        println(key)
    }

    println("has ford? ${"ford" in cars}")
    println("has 1908? ${1908 in cars.values}")

}


