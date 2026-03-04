package oop_127511_vierza.week05.tugasMandiri2

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if ((usedAmount + amount) <= limit) {
            usedAmount += amount
            println("Payment successful! Used credit: $usedAmount / $limit")
        } else {
            println("Transaction declined. Credit limit exceeded.")
        }
    }
}