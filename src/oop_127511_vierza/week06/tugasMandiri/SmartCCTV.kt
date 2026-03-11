package oop_127511_vierza.week06.tugasMandiri

import oop_127511_vierza.week06.latihan.Rechargeable

class SmartCCTV (override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name Turned on")
        startRecord()
    }
    override fun turnOff() {
        println("$name Turned off")
        stopRecord()
    }

    override fun startRecord() {
        println("$name Start Recording")
    }
}