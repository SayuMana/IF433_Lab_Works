package oop_127511_vierza.week03

class Employee(val name:String) {
    var salary:Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Salary cannot be 0 or negative! Set to 0")
                field = 0
            } else {
                field = value
            }
        }

    private var performanceRating:Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Performance of $name increasing, current Rating: $performanceRating")
    }

    fun printStatus() {
        println("Employee: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1
}
