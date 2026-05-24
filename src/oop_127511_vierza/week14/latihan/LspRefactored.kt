package oop_127511_vierza.week14.latihan

interface Shape {
    fun area(): Int
}

class SafeRectangle(val width: Int, val height: Int) : Shape {
    override fun area() = width * height
}

class SafeSquare(var side: Int) : Shape {
    override fun area() = side * side
}