package oop_127511_vierza.week14.tugasMandiri
import java.io.File

fun main() {
    val repo = CsvOrderRepository()
    val notifier = EmailNotifier()
    val processor = SafeOrderProcessor(repo, notifier)
    val vipPricing = VIPPricing()

    processor.processOrder(
        "Ayam Goreng",
        25000.0,
        "VIP",
        vipPricing
    )

}

class BadOrderProcessor {


//    private val file = File("src/oop_127511_vierza/week14/tugasMandiri/orders.csv") //DIP
//
//    fun processOrder(itemName: String, basePrice:Double, customerType: String) {
//        val finalPrice = when (customerType) {
//            "REGULAR" -> basePrice
//            "VIP" -> basePrice * 0.9
//            else -> basePrice
//        } // ocp

//        println("Memproses pesanan $itemName seharga $finalPrice")

//        file.appendText("$itemName,$finalPrice,$customerType\n") //srp dip
//        println("Email terkirim! Pesanan $itemName Anda telah dikonfirmansi!") // srp dip
//    }
}