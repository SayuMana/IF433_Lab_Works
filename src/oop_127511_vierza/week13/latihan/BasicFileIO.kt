package oop_127511_vierza.week13.latihan
import java.io.File

fun main() {
    println("\nTest write text")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Text berhasil di-append")
}