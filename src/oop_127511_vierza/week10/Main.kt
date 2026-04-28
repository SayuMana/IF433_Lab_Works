package oop_127511_vierza.week10

fun main() {
    println("Test generic class")
    val intBox = Box(100)
    val stringBox = Box("Hello")
    println(intBox.value)
    println(stringBox.value)

    println("\nTest multiple parameters")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")
}