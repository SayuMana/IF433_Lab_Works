package oop_127511_vierza.week04.tugasMandiri2

class Developer() : Employee() {
    val programmingLanguage: String

    override fun work() {
        println("$name is now coding with $programmingLanguage")
    }
}