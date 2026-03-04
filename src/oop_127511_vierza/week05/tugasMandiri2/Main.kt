package oop_127511_vierza.week05.tugasMandiri2

fun main() {
    val ovo = EWallet("Hoshino", 50000.0)
    val visa = CreditCard("Hina", 100000.0)

    val payments: List<PaymentMethod> = listOf(ovo, visa)

    for (paymentMethod in payments) {
        println("Processing payment for ${paymentMethod.accountName}")
        paymentMethod.processPayment(75000.0)
        println("---------------")
    }
}