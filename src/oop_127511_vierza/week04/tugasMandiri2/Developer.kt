package oop_127511_vierza.week04.tugasMandiri2

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        println("$name is now coding with $programmingLanguage")
    }
}