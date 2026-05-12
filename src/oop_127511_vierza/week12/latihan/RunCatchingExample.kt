package oop_127511_vierza.week12.latihan

fun main() {
    println("Test RunCatching")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}