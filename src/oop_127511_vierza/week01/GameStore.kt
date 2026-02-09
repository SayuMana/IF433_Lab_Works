package oop_127511_vierza.week01

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.2).toInt()
} else {
    (price * 0.1).toInt()
}

fun main() {
    val gameTitle = "Tomb Raider"
    val price = 125000

    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt (
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice
    )
}

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, note: String?) {
    println("=== STRUK STEAMKW ===")
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan     : ${note ?: "Tidak ada catatan"}")
}