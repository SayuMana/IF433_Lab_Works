package oop_127511_vierza.week07.tugasMandiri

enum class ItemRarity(val dropChance: Int) {
    COMMON(65),
    UNCOMMON(20),
    RARE(10),
    EPIC(4),
    LEGENDARY(1)
}

data class GameItem (
    val name: String,
    val rarity: ItemRarity,
)
