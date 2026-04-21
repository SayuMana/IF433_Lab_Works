package oop_127511_vierza.week09.latihan

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8)
    println("Original numbers: $numbers")
    println("\nHOF filter")
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens: $evens")

    println("\nHOF map")
    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")
}