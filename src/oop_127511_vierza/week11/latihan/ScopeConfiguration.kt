package oop_127511_vierza.week11.latihan

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("Test apply")
    val user = User().apply {
        name = "Hoshino"
        age = 17
    }
    println(user)
}