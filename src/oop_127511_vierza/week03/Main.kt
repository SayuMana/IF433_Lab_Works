package oop_127511_vierza.week03

fun main() {
    val e = Employee("Hina")

    e.salary = -1000
    e.salary = 5000
    println("Salary: ${e.salary}")

    e.increasePerformance()
    println("Tax you must pay: ${e.tax}")
}