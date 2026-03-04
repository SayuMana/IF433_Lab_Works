package oop_127511_vierza.week05.teori

fun main() {
    val dosen1 = Dosen("Takanashi Hoshino", "06767")
    val admin1 = Admin("Sorasaki Hina")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("Aktivitas Pegawai")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Dosen Terdeteksi (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Admin terdeteksi")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------------")
    }
}