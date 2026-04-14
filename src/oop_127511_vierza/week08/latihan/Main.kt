package oop_127511_vierza.week08.latihan

fun main() {
    println("Test save calls & elvis")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\nTest let block")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)
}