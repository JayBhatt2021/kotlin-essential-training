package chapter7._07_04

/**
 * Composition is better than inheritance since it ultimately produces smaller classes.
 * To see the equivalent inheritance examples, look at steps 1-3 in composition.txt.
 **/

// IWorker Interface
interface IWorker {
    val jobTitle: String
    fun trackHours(hours: Double)
    fun doWork()
}

// Worker Class that implements the IWorker Interface
class Worker(override val jobTitle: String) : IWorker {
    private var totalHours = 0.0

    override fun trackHours(hours: Double) {
        totalHours += hours
    }

    override fun doWork() {
        println("Doing $jobTitle work.")
    }
}

// IBeing Interface
interface IBeing {
    val firstName: String
    fun getName(): String
}

// Being Class that implements the IBeing Interface
class Being(override val firstName: String) : IBeing {
    override fun getName(): String {
        return firstName
    }
}

// IPayment Interface
interface IPayment {
    fun calcPay(): Double
}

// HourlyPay Class that implements the IPayment Interface
class HourlyPay(private val hourlyRate: Double) : IPayment {
    override fun calcPay(): Double {
        return hourlyRate
    }
}

// SalariedPay Class that implements the IPayment Interface
class SalariedPay(private val yearlyRate: Double) : IPayment {
    override fun calcPay(): Double {
        return yearlyRate
    }
}

// NoPay Class that implements the IPayment Interface
class NoPay() : IPayment {
    override fun calcPay(): Double {
        return 0.0
    }
}

// Employee Class that implements all previous interfaces
class Employee(worker: IWorker, being: IBeing, pay: IPayment) :
    IWorker by worker, IBeing by being, IPayment by pay {
}

fun main() {
    // Setting up and using an Hourly Pay Employee
    val hourlyEmployee = Employee(Worker("Bit Wrangler"), Being("Abel"), HourlyPay(42.42))
    println("My name is ${hourlyEmployee.getName()}.")
    hourlyEmployee.doWork()

    // Setting up and using a Salaried Pay Employee
    val salariedEmployee =
        Employee(Worker("Program Manager"), Being("Beth"), SalariedPay(100_000.0))
    println("\nMy name is ${salariedEmployee.getName()}.")
    salariedEmployee.doWork()

    // Setting up and using a No Pay Employee
    val rescueDog = Employee(Worker("Rescue Dog"), Being("Fido"), NoPay())
    println("\nMy name is ${rescueDog.getName()}.")
    rescueDog.doWork()
}
