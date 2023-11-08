package chapter9._09_01.end

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        asyncAwait()
    }
    println("$time ms")
}

suspend fun longCalc(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}

fun synchronous() = runBlocking {
    val x1 = longCalc(100)
    val x2 = longCalc(200)
    val x3 = longCalc(300)
    val sum = listOf(x1, x2, x3).sum()
    println("results = $sum")
}

fun asyncAwait() = runBlocking {
    println("async/await beginning")
    val x1 = async {longCalc(100)}
    val x2 = async {longCalc(200)}
    val x3 = async {longCalc(300)}
    val sum = listOf(x1, x2, x3).awaitAll().sum()
    println("async/await results = $sum")
}
