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

        // Accessing the Class Instance via passing in its Reference
        fun sillyPrint(self: CantCreate) {
            println("Accessing \"${self.message}\"")
        }
    }
}

fun main() {
    // Cannot Create Objects from Private Class Constructors
    // val c1 = CantCreate("Example Message")

    // Using a Companion Object's Factory Method for Object Instantiation
    val c1 = CantCreate.factory("Example Message")

    // Displaying the Message
    print("Message: ")
    c1.showMessage()

    // Demonstrating Companion Object Access to its Class Instance
    print("\nCantCreate.sillyPrint(c1) yields: ")
    CantCreate.sillyPrint(c1)

    // Printing a Companion Object Constant
    println("\nThe speed of light is ${CantCreate.LIGHT_SPEED} m/s.")
}
