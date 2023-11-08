package chapter9._09_01.begin

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    // Evaluates the Duration of synchronous() in Milliseconds
    val synchronousTime = measureTimeMillis {
        synchronous()
    }
    println("$synchronousTime ms\n")

    // Evaluates the Duration of asyncAwait() in Milliseconds
    val asynchronousTime = measureTimeMillis {
        asyncAwait()
    }
    println("$asynchronousTime ms")
}

// Returns startNum + 1 after a 1-second Delay to Simulate a Long Calculation
suspend fun longCalc(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}

// Simulates a Synchronous Call
fun synchronous() = runBlocking {
    // Part of the Coroutine
    val valueOne = longCalc(100)
    val valueTwo = longCalc(200)
    val valueThree = longCalc(300)
    val sum = listOf(valueOne, valueTwo, valueThree).sum()
    println("synchronous(): The sum is $sum.")
}

// Simulates an Asynchronous Call
fun asyncAwait() = runBlocking {
    // Part of the Coroutine
    val valueOne = async { longCalc(100) }
    val valueTwo = async { longCalc(200) }
    val valueThree = async { longCalc(300) }
    val sum = listOf(valueOne, valueTwo, valueThree).awaitAll().sum()
    println("asyncAwait(): The sum is $sum.")
}
