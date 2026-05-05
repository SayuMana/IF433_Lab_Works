package oop_127511_vierza.week11.latihan

fun main() {
    println("\nTest Let Functions")
    val name: String? = "Alex"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}