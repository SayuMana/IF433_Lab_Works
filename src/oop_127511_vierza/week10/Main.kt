package oop_127511_vierza.week10

fun main() {
    println("Test generic class")
    val intBox = Box(100)
    val stringBox = Box("Hello")

    println(intBox.value)
    println(stringBox.value)
}