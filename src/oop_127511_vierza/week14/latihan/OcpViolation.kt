package oop_127511_vierza.week14.latihan

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student" -> (price * 0.80)
            "member" -> (price * 0.85)
            "employee" -> (price * 0.70)
            else -> price
        }
    }
}