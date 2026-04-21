package oop_127511_vierza.week09.latihan

fun main() {
    println("Test lambda")
    val sumLambda = { a: Int, b: Int -> a+b }
    println("Sum lambda: ${sumLambda(6, 4)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Square implicit: ${squareImplicit(6)}")
}