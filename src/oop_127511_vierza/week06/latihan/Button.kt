package oop_127511_vierza.week06.latihan

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '${name}' berhasil diklik!")
    }
}