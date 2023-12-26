package chapter4._04_04

fun main() {
    // Kotlin Map Basics
    val readOnlyMapOne = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma", 4 to "delta")
    val readOnlyMapTwo = mapOf(4 to "delta", 3 to "gamma", 2 to "beta", 1 to "alpha")
    println("Is readOnlyMapOne equal to readOnlyMapTwo? ${readOnlyMapOne == readOnlyMapTwo}")

    // Accessing map values:
    println("\nreadOnlyMapOne.get(2) returns \"${readOnlyMapOne.get(2)}\".")
    println("readOnlyMapOne[5] returns \"${readOnlyMapOne[5]}\".")

    // Returning non-null values for invalid keys:
    println(
        "\nreadOnlyMapOne.getOrDefault(6, \"No match!\") returns " +
                "\"${readOnlyMapOne.getOrDefault(6, "No match!")}\"."
    )

    // Mutable maps and their methods:
    val mutableCarMap = mutableMapOf(
        "Ford" to 1903, "G.M." to 1908, "Dodge" to 1913, "Tucker" to 1944
    )
    mutableCarMap.put("Mercedes-Benz", -1)
    mutableCarMap["Mercedes-Benz"] = 1883
    println("\nmutableCarMap.remove(\"Tucker\") returns ${mutableCarMap.remove("Tucker")}.")
    println("Updated mutableCarMap: $mutableCarMap")

    // keys/values property and the in membership operator:
    print("\nmutableCarMap has the following keys: ")
    for (key in mutableCarMap.keys) {
        print("\"$key\" ")
    }

    print("\nmutableCarMap has the following values: ")
    for (value in mutableCarMap.values) {
        print("$value ")
    }

    println("\n\nIs \"Ford\" in mutableCarMap? ${"Ford" in mutableCarMap}")
    println("Is 1908 in mutableCarMap.values? ${1908 in mutableCarMap.values}")
}
