package chapter7._07_07.end

class Bosco {
    companion object {
        private var count = 0
        fun increment() {
            count++
        }

        fun show() {
            println("$count instances created.")
        }
    }

    init {
        increment()
    }
}

fun nop() {
    val b = Bosco()
}

fun main() {
    val b1 = Bosco()
    val b2 = Bosco()
    nop()
    val b3 = Bosco()
    Bosco.show()
}
