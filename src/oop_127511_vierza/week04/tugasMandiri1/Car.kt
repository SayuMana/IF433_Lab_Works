package oop_127511_vierza.week04.tugasMandiri1

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("${brand}'s trunk with $numberOfDoors doors opened")
    }

    override fun honk() {
        println("${brand}: PEEEEEEEEEEEP")
    }

    override fun accelerate() {
        super.accelerate()
        println("${brand} is accelerating!")
    }
}