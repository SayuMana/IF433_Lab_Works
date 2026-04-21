package oop_127511_vierza.week09.latihan

data class Student(
    val name: String,
    val gpa: Double
)

fun main() {
    val students = listOf(
        Student("Hoshino", 4.0),
        Student("Hina", 3.98),
        Student("Aru", 1.0),
        Student("Shiroko", 2.0),
    )
}