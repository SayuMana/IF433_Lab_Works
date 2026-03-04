package oop_127511_vierza.week05.tugasMandiri2

class EWallet(accountName:String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Payment success! Your balance now: $balance")
        } else {
            println("Payment fail! Insufficient balance (Amount : $amount)")
        }
    }

    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Top up of $amount successful! New balance: $balance")
        } else {
            println("Top up failed. Amount must be more than 0")
        }
    }
}