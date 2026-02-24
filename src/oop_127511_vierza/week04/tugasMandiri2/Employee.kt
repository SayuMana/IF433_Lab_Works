package oop_127511_vierza.week04.tugasMandiri2

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name is working")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
    }
}