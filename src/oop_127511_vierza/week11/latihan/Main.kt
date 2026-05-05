package oop_127511_vierza.week11.latihan

fun main() {
    println("\nTest extension function")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val nullText: String? = null
    println("Apakah null/empty? ${nullText.isNullOrEmptyCustom()}")
}