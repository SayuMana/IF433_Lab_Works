package oop_127511_vierza.week13.latihan
import java.io.File

fun main() {
    println("\nTest unsafe resource handling")
    val unsafeFile = File("unsafeLogs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")
    writer.close()
    println("Proses penulisan unsafe selesai")

    println("\nTest safe resource handling")
    val safeFile = File("safeLogs.txt")
    safeFile.printWriter().use { out ->
        for (i in 1..100) {
            out.println("Safe Log entry #$i: System status OK")
        }
        println("100 baris log berhasil di generate dengan aman")
    }

    println("\nTest buffered reader")
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach { line ->
            println("Stream Read: $line")
        }
    }
}