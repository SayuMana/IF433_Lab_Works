package oop_127511_vierza.week06.tugasMandiri

class SmartSpeaker(override val id: String, override val name: String, var song: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Turn On")
    }

    override fun turnOff() {
        println("Turn Off")
    }

    fun playMusic(Song:String) {
        println("Memutar lagu $song dari Spotify")
    }
}