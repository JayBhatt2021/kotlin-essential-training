package chapter4._04_02.end

fun main() {
    val names = listOf("Daisy", "Hattan", "Rob", "Chenni")
    println("The first name is ${names.get(0)}")
    println("The first name is ${names[0]}")

    val subNames = names.subList(1,3)
    println(subNames)

    val items = mutableListOf(2, 4, 6, 8, 10, 10, 10, 10, 14)
    items[0] = 1
    items.add(12)
    items.removeAt(3)
    items.remove(99)
    println(items)
    println("There are ${items.size} items.")
    println("The first item is ${items.first()}")
}

