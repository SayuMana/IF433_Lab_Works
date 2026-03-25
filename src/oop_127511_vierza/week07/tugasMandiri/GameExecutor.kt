package oop_127511_vierza.week07.tugasMandiri

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Melawan monster ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            println("Loot Dropped! (${event.item.name} (Rarity: ${event.item.rarity}))")
        }
        is BattleState.GameOver -> {
            println("Game Over! ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Safe Zone!")
        }
    }
}

