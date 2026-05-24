package oop_127511_vierza.week14.latihan

interface DiscountStrategy {
    fun apply(price: Double): Double
}

class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double) = (price * 0.80)
}

class MemberDiscount : DiscountStrategy {
    override fun apply(price: Double) = (price * 0.85)
}