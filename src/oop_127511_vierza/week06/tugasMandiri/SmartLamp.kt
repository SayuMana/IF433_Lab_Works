package oop_127511_vierza.week06.tugasMandiri

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name Turn On")
    }

    override fun turnOff() {
        println("$name Turn Off")
    }
}