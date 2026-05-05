package oop_127511_vierza.week11.tugasMandiri

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philips WiZ Living Room", category = "Lightning").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        println("Data Baru: $it")
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}