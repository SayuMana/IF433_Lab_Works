package oop_127511_vierza.week03.tugasMandiri

class Weapon {
    var name:String = "Default"
    var damage:Int = 0
        set(value) {
            if (value <= 0) {
                println("Damage must be greater than 0, set to default ($damage)")
            } else if (value > 1000) {
                field = 1000
                println("Damage too overpowered (max 1000). Set to 1000")
            } else {
                field = value
            }
        }
    var tier:String = "common"
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}