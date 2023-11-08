package chapter4._04_05.begin

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 5, 6, 7, 7, 8)
    val set = setOf(10, 20, 30, 40, 50)
    val map = mapOf(1 to 10, 2 to 20, 3 to 30)

    // Collection Operation #1: Transformations
    val transformedList = list.map { element ->
        element * 2
    }
    println("transformedList contains $transformedList.")

    val transformedMap = map.map { mapEntry ->
        Pair(mapEntry.key, mapEntry.value * 10)
    }.toMap()
    println("transformedMap contains $transformedMap.")

    // Collection Operation #2: Filtering
    val filteredList = list.filter { element ->
        element % 2 == 1
    }
    println("\nfilteredList only contains odd values: $filteredList.")

    val filteredSet = set.filter { element ->
        element > 100
    }
    println("Is filteredSet empty? ${filteredSet.isEmpty()}")

    // Collection Operation #3: Ordering
    val descendingSet = set.sortedDescending()
    println("\ndescendingSet contains $descendingSet.")

    // Collection Operation #4: Retrieving an Element
    val transformedListLastItem = transformedList.last { lastElement ->
        lastElement > 2
    }
    println("\nLast Item (if meets > 2 requirement): $transformedListLastItem")


    // Collection Operation #5: Retrieving a Collection
    val listToSet = list.toSet()
    println("\nConverting the list variable to a set yields $listToSet.")

    val setToList = set.toList()
    println("Converting the set variable to a list yields $setToList.")
}
