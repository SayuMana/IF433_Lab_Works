package oop_127511_vierza.week06.tugasMandiri

class SmartSpeaker(override val id: String, override val name: String, var song: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name Turned On")
    }

    override fun turnOff() {
        println("$name Turned Off")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify")
    }
}