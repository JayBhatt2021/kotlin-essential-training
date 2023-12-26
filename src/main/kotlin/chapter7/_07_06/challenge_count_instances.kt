package chapter7._07_06

class InstanceClass {
    // Increments instanceCount by one upon the creation of a new InstanceClass object:
    init {
        increment()
    }

    // Companion Object of InstanceClass
    companion object {
        // Stores the number of InstanceClass instances:
        private var instanceCount = 0

        // Increments instanceCount by one:
        fun increment() {
            instanceCount++
        }

        // Displays the number of InstanceClass instances:
        fun show() {
            println("There are $instanceCount instance(s) of InstanceClass.")
        }
    }
}

// Creates a new InstanceClass object:
fun createObject() {
    val i = InstanceClass()
}

fun main() {
    // Creates four InstanceClass objects:
    val i1 = InstanceClass()
    val i2 = InstanceClass()
    createObject()
    val i3 = InstanceClass()

    // Displays the number of created InstanceClass objects:
    InstanceClass.show()
}
