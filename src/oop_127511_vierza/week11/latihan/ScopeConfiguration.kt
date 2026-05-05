package oop_127511_vierza.week11.latihan

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("\nTest apply")
    val user = User().apply {
        name = "Hoshino"
        age = 17
    }
    println(user)

    println("\nTest also")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log sebelum ditambah: $it")
    }.add(4)
    println("Setelah ditambah: $numbers")

    println("\nTest With")
    with(user) {
        println("User Detail -> Nama: ${name}, Umur: ${age}")
    }
}