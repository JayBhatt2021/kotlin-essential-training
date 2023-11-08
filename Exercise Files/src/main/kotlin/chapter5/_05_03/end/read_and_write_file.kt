package chapter5._05_03.end

import java.io.File

fun main() {
    val res = "./resources"
    val pets = "pets.txt"
    val pFile = File("${res}/$pets")

    val file = File("${res}/text.txt")
    file.forEachLine { println(it) }

    val writeFile = File("$res/write.txt")
    writeFile.writeText("Kotlin = happiness")

    val pList = listOf("cat", "dog", "bird")
    pFile.writeText("")
    pList.forEach{ pFile.appendText("$it\n")}

    val newPets = mutableListOf<String>()
    pFile.forEachLine { newPets.add(it) }
    println()
    println(newPets)

    val exists = pFile.exists()
    println("\npets exists? $exists")
}


