package oop_127511_vierza.week04.tugasMandiri1

open class ElectricCar(brand: String, numberOfDoor: Int, val batteryCapacity: Int) : Car(brand, numberOfDoor) {
    final override fun accelerate() {
        println("$brand is accelerating in silent! Battery Capacity: ${batteryCapacity}%")
    }
}