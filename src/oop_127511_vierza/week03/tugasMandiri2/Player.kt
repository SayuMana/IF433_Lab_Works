package oop_127511_vierza.week03.tugasMandiri2

class Player {
    var player: String = "Unknown"
    private var xp: Int = 0
    var level: Int = 0
        get() = (xp / 100) + 1

    fun addXP(amount: Int) {
        if (amount <= 0) {
            println("Only positive number")
            return
        }
        var oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Congrats! ${player}. Your level is increased to level ${newLevel}!")
        }
    }
}