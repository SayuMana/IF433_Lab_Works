package oop_127511_vierza.week04.pratikum

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand is moving. Speed: $speed km/h")
    }

    override fun honk() {
        println("PEEEEEEEEEP! $brand is moving!")
    }
}