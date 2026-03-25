package oop_127511_vierza.week07.tugasMandiri

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    val legendaryChance = ItemRarity.LEGENDARY.dropChance
    println("\nPersentase drop rate untuk item LEGENDARY: $legendaryChance%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("\nMendapatkan senjata awal:")
    println("Nama\t\t: ${starterWeapon.item.name}")
    println("Damage\t\t: ${starterWeapon.item.damage}")
    println("Rarity\t\t: ${starterWeapon.item.rarity}")
    println("Durability\t: ${starterWeapon.durability}")
}