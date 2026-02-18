package oop_127511_vierza.week03.tugasMandiri

import com.sun.tools.javac.code.TypeAnnotationPosition.field

fun main() {
    var weapon = Weapon()

    weapon.damage = -50
    println(weapon.damage)
    weapon.damage = 1000
    println(weapon.damage)
    println(weapon.tier)
}