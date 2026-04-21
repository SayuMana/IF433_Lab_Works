package oop_127511_vierza.week09.latihan

fun main() {
    println("Test list")
    val frameworks: List<String> = listOf("C#", "Java", "Python")
    // frameworks.add("JavaScript")
    println("Immutable List: $frameworks")

    val scores:MutableList<Int> = mutableListOf(67, 727)
    scores.add(95)
    scores[0] = 77
    println("Mutable List: $scores")
}