package oop_127511_vierza.week04.tugasMandiri2

open class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        println("$name is leading division meeting")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}