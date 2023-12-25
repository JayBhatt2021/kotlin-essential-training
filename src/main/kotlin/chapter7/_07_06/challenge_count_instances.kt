package chapter7._07_06

class InstanceClass {
    // Increments instanceCount by One upon the Creation of a New InstanceClass Object
    init {
        increment()
    }

    // Companion Object of InstanceClass
    companion object {
        // Stores the Number of InstanceClass Instances
        private var instanceCount = 0

        // Increments instanceCount by One
        fun increment() {
            instanceCount++
        }

        // Displays the Number of InstanceClass Instances
        fun show() {
            println("There are $instanceCount instance(s) of InstanceClass.")
        }
    }
}

// Creates a New InstanceClass Object
fun createObject() {
    val i = InstanceClass()
}

fun main() {
    // Creates Four InstanceClass Objects
    val i1 = InstanceClass()
    val i2 = InstanceClass()
    createObject()
    val i3 = InstanceClass()

    // Displays the Number of Created InstanceClass Objects
    InstanceClass.show()
}
