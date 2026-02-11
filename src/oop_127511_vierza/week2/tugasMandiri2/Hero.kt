package oop_127511_vierza.week2.tugasMandiri2

class Hero (
    var name: String,
    var baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("${name} attacked ${targetName}!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp <= 0) hp = 0

        println("$name got attacked by ${damage}. Current HP: ${hp}")
    }

    fun isAlive(): Boolean {return hp > 0}
}