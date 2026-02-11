package oop_127511_vierza.week2

class Student(
    val name: String,
    val nim: String,
    var major: String
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan nim ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di Memory.")
        }
    }
}