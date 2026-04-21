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

    println("\nTest set")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("User1", "User2")
    activeUsers.add("User3")
    activeUsers.add("User1")
    println("Active Users: $activeUsers")

    println("\nTest map")
    val studentGrades = mapOf(
        "Hoshino" to "A",
        "Hina" to "B",
        "Mika" to "A"
    )
    println("Nilai Hina: ${studentGrades["Hina"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}