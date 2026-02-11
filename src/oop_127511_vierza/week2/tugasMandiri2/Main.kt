package oop_127511_vierza.week2.tugasMandiri2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()

    var hero = Hero(name, baseDamage)

    var enemyName = "Menendez"
    var enemyHP = 100
    println("${enemyName} is attacking you!")

    while (hero.isAlive() && enemyHP > 0) {
        println("1. Attack")
        println("2. Run")
        print("Choose: ")
        var choose = scanner.nextInt()

        if (choose == 1) {
            enemyHP -= baseDamage
            println("Current Enemy's HP: ${enemyHP}")
            if (enemyHP > 0) {
                var randomDamage = (10..20).random()
                hero.takeDamage(randomDamage)
            }
            println("Your hp: ${hero.hp}")
        }

        else if (choose == 2) break
        else {
            println("Invalid choice")
        }
    }

    if (!hero.isAlive()) {
        println("${hero.name} dead!")
    } else if (enemyHP <= 0) {
        println("${hero.name} killed ${enemyName}!")
    } else {
        println("${hero.name} is running away!")
    }
}