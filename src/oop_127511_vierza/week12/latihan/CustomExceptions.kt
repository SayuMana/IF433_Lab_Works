package oop_127511_vierza.week12.latihan

class InsufficientFundsException (
    val amount: Double,
    val balance: Double
) : Exception("Attemped: $amount balance: $balance")