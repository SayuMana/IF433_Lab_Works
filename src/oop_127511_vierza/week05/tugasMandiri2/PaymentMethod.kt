package oop_127511_vierza.week05.tugasMandiri2

abstract class PaymentMethod(val accountName:String) {
    abstract fun processPayment(amount:Double)
}