package chapter7._07_05

// Class with a Private Constructor and a Companion Object
class CantCreate private constructor(val message: String) {
    fun showMessage() {
        println(message)
    }

    // Companion Object
    companion object {
        // Companion Object Constant
        const val LIGHT_SPEED = 299_792_458

        // Factory Method for Object Instantiation
        fun factory(message: String) : CantCreate {
            return CantCreate(message)
        }

        // Accessing the class instance via passing in its reference:
        fun sillyPrint(self: CantCreate) {
            println("Accessing \"${self.message}\"")
        }
    }
}

fun main() {
    // Cannot create objects from private class constructors:
    // val c1 = CantCreate("Example Message")

    // Using a companion object's factory method for object instantiation:
    val c1 = CantCreate.factory("Example Message")

    // Displaying the message:
    print("Message: ")
    c1.showMessage()

    // Demonstrating companion object access to its class instance:
    print("\nCantCreate.sillyPrint(c1) yields: ")
    CantCreate.sillyPrint(c1)

    // Printing a companion object constant:
    println("\nThe speed of light is ${CantCreate.LIGHT_SPEED} m/s.")
}
