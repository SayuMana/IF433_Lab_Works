package oop_127511_vierza.week10.latihan

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum() : Double {
        return value1.toDouble() + value2.toDouble()
    }
}