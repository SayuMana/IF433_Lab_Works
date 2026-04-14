package oop_127511_vierza.week08.latihan

fun main() {
    println("Test save calls & elvis")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}