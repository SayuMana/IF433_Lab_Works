package oop_127511_vierza.week04.tugasMandiri1

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

    println("\nTesting Electric Car")
    val car2 = ElectricCar("Subaru New Electric", 2, 80)
    car2.openTrunk()
    car2.accelerate()
    car2.honk()
}