package oop_127511_vierza.week14.tugasMandiri
import java.io.File

data class Order(
    val itemName: String,
    val basePrice: Double,
    val customerType: String,
)

class CsvOrderRepository : OrderRepository {
    private val file = File("src/oop_127511_vierza/week14/tugasMandiri/orders.csv")
    override fun saveOrder(order: Order) {
        file.writer().use { writer ->
            writer.append("${order.itemName},${order.customerType},${order.customerType}\n")
        }
    }
}

class EmailNotifier : NotificationService {
    override fun sendNotification(order: Order) {
        println("Email terkirim! Pesanan ${order.itemName} Anda telah dikonfirmansi!")
    }
}

class SafeOrderProcessor(
    private val repo : OrderRepository,
    private val notifier: EmailNotifier,
) {

}