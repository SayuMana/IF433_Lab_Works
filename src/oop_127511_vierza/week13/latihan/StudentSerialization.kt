package oop_127511_vierza.week13.latihan
import java.io.File
import java.io.FileNotFoundException

data class Student(
    val name: String,
    val age: Int,
    val gpa: Double
)

// Serialization (Object to CSV)
fun Student.toCSV(): String = "$name, $age, $gpa"

// Deseletialization (CSV to Object)
fun fromCSV(line: String) : Student{
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}

