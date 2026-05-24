package oop_127511_vierza.week14.tugasMandiri
import java.io.File

class BadOrderProcessor {
//    private val file = File("src/oop_127511_vierza/week14/tugasMandiri/orders.csv") //DIP

    fun processOrder(itemName: String, basePrice:Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.9
            else -> basePrice
        } // ocp

//        println("Memproses pesanan $itemName seharga $finalPrice")

//        file.appendText("$itemName,$finalPrice,$customerType\n") //srp dip
//        println("Email terkirim! Pesanan $itemName Anda telah dikonfirmansi!") // srp dip
    }
}