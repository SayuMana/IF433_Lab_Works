package oop_127511_vierza.week12.latihan

class InsufficientFundsException (
    val amount: Double,
    val balance: Double
) : Exception("Attemped: $amount balance: $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw IllegalArgumentException("Amount must be positive")
        }
        if (amount > balance) {
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}

fun main() {
    println("Test multiple catch")
    val account = BankAccount(100.0)

    try {
        account.withdraw(-20000.0)
    } catch (e: InsufficientFundsException) {
        println("Insufficient funds: ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Invalid input: ${e.message}")
    } catch (e: Exception) {
        println("Internal error: ${e.message}")
    }
}