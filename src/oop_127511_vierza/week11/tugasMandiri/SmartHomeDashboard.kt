package oop_127511_vierza.week11.tugasMandiri

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philips WiZ Living Room", category = "Lightning").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("Data Baru: $it")
    }

}