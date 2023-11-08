package chapter4._04_03.begin

fun main() {
    // Kotlin Set Fundamentals
    val threes = setOf(3, 3, 3, 3)
    println("A set with multiple 3's will produce $threes.")

    // Kotlin Set Properties and Methods
    println("\nThe size of the threes set is ${threes.size}.")
    println("Is 4 in the set? ${threes.contains(4)}")

    // Kotlin Mutable Sets
    val mutableSetOne = mutableSetOf(1, 2, 3, 4, 5)
    val mutableSetTwo = mutableSetOf(5, 4, 3, 2, 1)
    println(
        "\n(Set Order Preserved) Is the first value of mutableSetOne equal to the first value of " +
                "mutableSetTwo? ${mutableSetOne.first() == mutableSetTwo.first()}"
    )
    println("Is mutableSetOne equal to mutableSetTwo? ${mutableSetOne == mutableSetTwo}")

    // Kotlin Hash Sets
    val hashSetOne = hashSetOf(1, 2, 3, 4, 5)
    val hashSetTwo = hashSetOf(5, 4, 3, 2, 1)
    println(
        "\n(Set Order Not Preserved) Is the first value of hashSetOne equal to the first value of " +
                "hashSetTwo? ${hashSetOne.first() == hashSetTwo.first()}"
    )
    println("Is hashSetOne equal to hashSetTwo? ${hashSetOne == hashSetTwo}")

    // More Mutable Set Methods
    println("\nWas 6 added to mutableSetOne? ${mutableSetOne.add(6)}")
    println("Was 76 removed from mutableSetOne ${mutableSetOne.remove(76)}")

    // Turning a Set into a List
    val newList = hashSetOne.toList()
    println("\nhashSetOne is converted to the following list $newList.")
    println("Unlike with a set, the get method can be used with a list: ${newList.get(1)}.")
    println("In addition to the indexOf operator: ${newList[1]}.")
}
