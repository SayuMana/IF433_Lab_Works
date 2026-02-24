package oop_127511_vierza.week04.pratikum

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("${brand}'s trunk with $numberOfDoors doors opened")
    }
}