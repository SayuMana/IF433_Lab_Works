package oop_127511_vierza.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val data1 = DataUser("Hoshino", 22)
    val data2 = DataUser("Hoshino", 22)
    println(data1)
    println("Sama? ${data1 == data2}")
}