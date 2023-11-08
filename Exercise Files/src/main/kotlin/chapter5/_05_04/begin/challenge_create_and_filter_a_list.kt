package chapter5._05_04.begin

import java.io.File

fun main() {
    // Pointing to the sales.txt File
    val res = "./resources"
    val salesFile = File("$res/sales.txt")

    // Filtering Doubles from sales.txt and Storing Them in a List
    val doubleList = mutableListOf<Double>()
    salesFile.forEachLine { fileLine ->
        val doubleValue: Double? = fileLine.toDoubleOrNull()
        if (doubleValue != null) {
            doubleList.add(doubleValue)
        }
    }

    println("The valid double values from sales.txt are:")
    doubleList.forEach { element ->
        println(element)
    }
}
