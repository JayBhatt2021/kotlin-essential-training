package chapter6._06_01.end

fun main() {
    greeter("Troy")
    println("Volume is ${volume(10, 5)}")
    println("Volume is ${volumeX(width = 7, height = 13)}")
}

fun greeter(name: String) = "Hello $name"
fun volume(length: Int, width: Int, height: Int = 10) = length * width * height
fun volumeX(length: Int = 10, width: Int, height: Int)  = length * width * height

