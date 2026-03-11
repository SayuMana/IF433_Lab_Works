package oop_127511_vierza.week06.latihan

interface Camera {
    fun turnOn() {
        println("Lensa kamera terbuka dan sensor aktif")
    }
}

interface Phone {
    fun turnOn() {
        println("Sinyal seluler mencari jaringan")
    }
}