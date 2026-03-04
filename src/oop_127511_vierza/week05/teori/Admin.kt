package oop_127511_vierza.week05.teori

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang melayani administrasi")
    }

    fun doAdminWork() {
        println("$nama sedang merekap data")
    }
}