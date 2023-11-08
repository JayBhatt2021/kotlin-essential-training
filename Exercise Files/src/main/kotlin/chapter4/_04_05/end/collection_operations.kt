package chapter4._04_05.end

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 5, 6, 7, 7, 8)
    val set = setOf(10, 20, 30, 40, 50)
    val map = mapOf(1 to 10, 2 to 20, 3 to 30)

    val tList = list.map{ it * 2}
    println("transformed list = $tList")
    val tMap = map.map{ Pair(it.key, it.value * 10)}.toMap()
    println("transformed map = $tMap")

    println()
    val fList = list.filter { it % 2 == 1}
    println("only odds = $fList")
    val fSet = set.filter { it > 100 }
    println("Is fSet empty? = ${fSet.isEmpty()}")

    println("sorted descending set = ${set.sortedDescending()}")

    println()
    println("tList last: ${tList.last { it > 2}}")

    println()
    println("list to set = ${list.toSet()}")
    println("set to list = ${set.toList()}")
}
