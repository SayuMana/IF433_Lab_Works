package oop_127511_vierza.week11.latihan

fun String.addGreeting(): String {
    return "Hello $this"
}

fun String.repeatTimes(n:Int): String{
    return this.repeat(n)
}