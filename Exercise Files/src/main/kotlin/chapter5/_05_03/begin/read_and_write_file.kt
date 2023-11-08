package chapter5._05_03.begin

import java.io.File

fun main() {
    // Kotlin File Basics
    val res = "./resources"
    val pets = "pets.txt"
    val petsFile = File("$res/$pets")

    // Reading a File (line-by-line)
    val file = File("$res/text.txt")
    println("Content of text.txt:")
    file.forEachLine { fileLine ->
        println(fileLine)
    }

    // Writing Text to a File
    val writeFile = File("$res/write.txt")
    val writeString = "Kotlin = happiness"
    writeFile.writeText(writeString)
    println("\n\"$writeString\" has been written into write.txt.")

    // Clearing a File before Writing List Elements to It
    val petsList = listOf("cat", "dog", "bird")
    petsFile.writeText("")
    petsList.forEach { listElement ->
        petsFile.appendText("$listElement\n") // \n must be added here
    }
    println("\npets.txt has been cleared and then written into.")

    // Storing File Lines to a Collection
    val newPetsList = mutableListOf<String>()
    petsFile.forEachLine { fileLine ->
        newPetsList.add(fileLine)
    }
    println("\nThe contents of pets.txt is now stored in newPetsList: $newPetsList.")

    // Determining the Existence of a File
    val exists = petsFile.exists()
    println("\nDoes pets.txt exist? $exists")
}


