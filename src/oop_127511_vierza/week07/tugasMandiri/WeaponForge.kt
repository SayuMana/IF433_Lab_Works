package oop_127511_vierza.week07.tugasMandiri

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword() : Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword() : Weapon {
            val epicItem = GameItem("Pedang Membelah Laut", 70, ItemRarity.EPIC)
            return Weapon(epicItem, 300)
        }
    }
}
