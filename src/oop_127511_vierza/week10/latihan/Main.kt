package oop_127511_vierza.week10.latihan

fun main() {
    println("Test generic class")
    val intBox = Box(100)
    val stringBox = Box("Hello")
    println(intBox.value)
    println(stringBox.value)

    println("\nTest multiple parameters")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\nTest generic function")
    printData(3.14)
    val results = processData("Stable Coin")
    println("Hasil proces: $results")
}