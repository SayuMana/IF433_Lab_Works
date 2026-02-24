package oop_127511_vierza.week04.tugasMandiri2

open class Manager() : Employee() {
    override fun work() {
        println("$name is leading division meeting")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}