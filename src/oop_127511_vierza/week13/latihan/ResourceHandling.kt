package oop_127511_vierza.week13.latihan
import java.io.File

fun main() {
    println("Test unsafe resource handling")
    val unsafeFile = File("unsafeLogs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")
    writer.close()
    println("Proses penulisan unsafe selesai")
}