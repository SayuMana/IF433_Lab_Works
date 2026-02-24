package oop_127511_vierza.week04.tugasMandiri2

fun main() {
    var manager = Manager("Hoshino", 1000000)
    var developer = Developer("Kisaki", 3000000, "C#")

    println("\nManager")
    manager.work()
    print("Current salary: ${manager.baseSalary}, ")
    print("Bonus: ${manager.calculateBonus()}")

    println("\n\nDeveloper")
    developer.work()
    print("Current salary: ${developer.baseSalary}, ")
    print("Bonus: ${developer.calculateBonus()}")
}