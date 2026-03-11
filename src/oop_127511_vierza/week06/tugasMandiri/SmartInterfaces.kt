package oop_127511_vierza.week06.tugasMandiri

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}