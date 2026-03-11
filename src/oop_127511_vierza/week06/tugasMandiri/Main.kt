package oop_127511_vierza.week06.tugasMandiri

fun main() {
    val smartLamp = SmartLamp("1", "Ruang Tamu")
    val smartSpeaker = SmartSpeaker("1", "Google Nest Dapur", "XaleidoscopiX")
    val smartCCTV = SmartCCTV("1", "Ezviz Garasi")

    smartLamp.turnOn()
    smartSpeaker.turnOn()
    smartCCTV.turnOn()

    println("\n")
    val hub = SmartHomeHub()
    hub.addDevice(smartLamp)
    hub.addDevice(smartSpeaker)
    hub.addDevice(smartCCTV)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}