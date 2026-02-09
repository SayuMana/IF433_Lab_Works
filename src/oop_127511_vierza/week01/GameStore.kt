package oop_127511_vierza.week01

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.2).toInt()
} else {
    (price * 0.1).toInt()
}

fun main() {
    val gameTitle = "Tomb Raider"
    val price = 125000
}