package chapter9._09_02

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    // Evaluates the Duration of timeOut() in Milliseconds
    val timeOutTime = measureTimeMillis {
        timeOut()
    }
    println("$timeOutTime ms\n")

    // Evaluates the Duration of cancel() in Milliseconds
    val cancelTime = measureTimeMillis {
        cancel()
    }
    println("$cancelTime ms")
}

// Returns startNum + 1 after a 1-second Delay to Simulate a Long Calculation
suspend fun longCalc(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}

// Simulates an Asynchronous Call with a Timeout Functionality
fun timeOut() = runBlocking {
    // Initializes the Specified Timeout Time
    val specifiedTimeoutTime = 2000L

    // Returns "Timed Out" if the Below Coroutine Time > specifiedTimeoutTime
    val results = withTimeoutOrNull(specifiedTimeoutTime) {
        val valueOne = async { longCalc(100) }
        val valueTwo = async { longCalc(200) }
        val valueThree = async { longCalc(300) }
        val sum = listOf(valueOne, valueTwo, valueThree).awaitAll().sum()
        println("timeOut(): The sum is $sum.")
        "Finished"
    } ?: "Timed Out"

    // Prints out the Return Value of withTimeoutOrNull
    println("timeOut(): withTimeoutOrNull returned \"$results\".")
}

// Simulates an Asynchronous Call with a Cancel Functionality
fun cancel() = runBlocking {
    // launch(Dispatchers.Default) Encapsulates its Inside Code in a Separate Thread
    val job = launch(Dispatchers.Default) {
        // Initializes Counter and Time Variables
        var i = 0
        var nextPrintTime = System.currentTimeMillis()

        // Prints the Elapsed Millisecond Amount every 100 Milliseconds
        while (isActive) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("cancel(): Working for ${i * 100} Milliseconds...")
                nextPrintTime += 100L
                i++
            }
        }
    }

    // Cancels the Above Coroutine after 1000 Milliseconds
    delay(1000L)
    println("cancel(): The job has been cancelled.")
    job.cancelAndJoin()
    println("cancel(): The method is now done.")
}
