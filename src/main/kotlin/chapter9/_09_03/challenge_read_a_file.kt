package chapter9._09_03

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File

fun main() {
    asynchronousReader()
}

// Prints the File Lines of the_whale.txt
fun asynchronousReader() = runBlocking {
    // Asynchronously Obtains the File Lines
    val fileLineList = async { readFile("the_whale.txt") }

    // Prints the File Lines after the Above Asynchronous Operation Completes
    fileLineList.await().forEach { fileLine ->
        println(fileLine)
    }
}

// Returns a List of File Lines for a Given File
fun readFile(fileName: String): List<String> {
    // Creates the File Object
    val file = File("./resources/$fileName")

    // Stores the File Lines as a List of Strings
    return file.readLines()
}
