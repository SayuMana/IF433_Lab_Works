package oop_127511_vierza.week04.pratikum

fun main() {
    println("Testing vehicle")
    val generalVehicle = Vehicle("Subaru")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\nTesting Car")
    val car = Car("Subaru 727", 2)
    car.openTrunk()
    car.honk()
    car.accelerate()
}