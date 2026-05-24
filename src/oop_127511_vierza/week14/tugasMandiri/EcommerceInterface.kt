package oop_127511_vierza.week14.tugasMandiri

interface OrderRepository {
    fun saveOrder(order: Order)
}

interface NotificationService {
    fun sendNotification(order: Order)
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}