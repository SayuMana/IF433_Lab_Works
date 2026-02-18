package oop_127511_vierza.week03

class Employee(val name:String) {
    var salary:Int = 0
        set(value) {
            println("Try set salary to: $value")
            this.salary = value
        }
}