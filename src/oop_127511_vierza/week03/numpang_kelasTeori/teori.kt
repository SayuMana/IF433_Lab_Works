package oop_127511_vierza.week03.numpang_kelasTeori

open class Bapake {
    private var nama: String = "Belum Tau"
    private var umur: Int = 35
    protected var gaji: Int = 1000000

    public var uangjajan:Int = 0
        set (value) {
            if (value < 0) {
                println("Masa uang jajan nya 0 gamu ngkin kan...")
            } else {
                field = value
            }
        }
        get() {
            return field + 123
        }

    fun set_nama(namabaru: String) {
        if (namabaru.isEmpty()) {
            println("Eh nama ga boleh kosong loh...")
        } else {
            this.nama = namabaru
        }
    }

    fun set_umur(umurBapak: Int) {
        if (umurBapak >= 100) {
            println("Umur terlalu tua bang...")
        } else if (umurBapak <= 10) {
            println("Umur bapakmu kecil amat bang...")
        } else {
            this.umur = umurBapak
        }
    }

    fun get_nama(): String {
        return this.nama
    }

    fun get_umur(): Int {
        return this.umur
    }
}// close class

class Anake: Bapake() {
    fun own_gaji_bapak(): Int {
        this.gaji = 5500000
        return this.gaji + 100
    }
}

fun main() {
    var bpk = Bapake()

    bpk.set_nama("Vintanius Chandrasius")
    bpk.set_umur(37)

    println("Nama ayah kamu: ${bpk.get_nama()}")
    println("Umur bapak kamu: ${bpk.get_umur()}")

    var ank= Anake()
    ank.set_nama("Anton")
    println("Nama papi kamu adalah ${ank.get_nama()}")
    println("Gaji bapak : " + ank.own_gaji_bapak())

    ank.uangjajan = -100
}