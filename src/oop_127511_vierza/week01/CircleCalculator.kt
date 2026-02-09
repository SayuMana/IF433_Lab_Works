package oop_127511_vierza.week01

fun checkSize(area:Double) {
    if (area > 100) {
        println("Lingkaran besar")
    } else {
        println("Lingkaran kecil")
    }
}

fun main(args: Array<String>) {
    var radius = 7.0
    var pi = 3.14

    var area = pi * radius * radius

    println("Radius: " + radius + ", Area: " + area)
    checkSize(area)
}