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

    homeDevices.add(
        run {
            SmartDevice(
                "Daikin Inverter (Kabel 3x2.5)",
                "HVAC",
                false,
                800
            )
        }
    )

    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }?.let {
        println(it.diagnose())
    }

    with(homeDevices) {
        println(this.size)
    }

    val totalPower = homeDevices.run {
        sumOf {
            it.powerLoad
        }
    }
    println("Total Power: $totalPower")
}