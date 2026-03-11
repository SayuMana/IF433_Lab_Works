package oop_127511_vierza.week06.tugasMandiri

class SmartHomeHub() {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices.indices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}