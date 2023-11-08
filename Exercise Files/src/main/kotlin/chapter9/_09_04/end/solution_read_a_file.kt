package chapter9._09_04.end

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File

fun main() {
    reader()
}

fun reader() = runBlocking{
    val d1 = async { readFile("the_whale.txt")}
    d1.await().forEach { println(it)}
}

fun readFile(fileName: String): List<String> {
    val file = File("./resources/$fileName")
    return file.readLines()
}
