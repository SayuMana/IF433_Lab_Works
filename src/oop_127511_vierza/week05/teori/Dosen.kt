package oop_127511_vierza.week05.teori

class Dosen(nama:String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang menyiapkan materi perkuliahan dan merevisi RPKPS")
    }

    fun mengajar() {
        println("$nama sedang mengajar")
    }
}