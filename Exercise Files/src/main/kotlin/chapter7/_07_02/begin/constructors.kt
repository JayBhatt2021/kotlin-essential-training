package chapter7._07_02.begin

// Class Constructor with a Default Parameter
class Vehicle(val make: String, val model: String, val year: Int, val state: String = "CA") {
    // Secondary Constructor Variables
    private var style = ""
    private var status = ""

    // First Init Block
    init {
        println("First Init Block for the $make $model: $this")
    }

    // First Secondary Constructor
    constructor(make: String, model: String, year: Int, state: String, style: String)
            : this(make, model, year, state) {
        this.style = style
    }

    // Second Secondary Constructor
    constructor(make: String, model: String, year: Int, state: String, style: String, status: String)
            : this(make, model, year, state, style) {
        this.status = status
    }

    override fun toString(): String {
        return "$year $make $model ($state)"
    }
}

fun main() {
    // Instantiating and Printing Out a Vehicle Object with a Default Argument
    val car = Vehicle("Chevrolet", "Volt", 2018)
    println("println(car) prints \"$car\".\n")

    // Instantiating and Printing Out a Vehicle Object with Named Arguments
    val car2 = Vehicle(state = "NV", year = 2019, make = "Ford", model = "Mustang")
    println("println(car2) prints \"$car2\".\n")

    // Instantiating and Printing Out a Vehicle Object using a Secondary Constructor
    val car3 = Vehicle("Tesla", "Model S", 2019, "RI", "PI00D")
    println("println(car3) prints \"$car3\".\n")

    // Instantiating and Printing Out a Vehicle Object using another Secondary Constructor
    val car4 = Vehicle("Tesla", "Model 3", 2019, "CA", "Performance", "New")
    println("println(car4) prints \"$car4\".")
}
