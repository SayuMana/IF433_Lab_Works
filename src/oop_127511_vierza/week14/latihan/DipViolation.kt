package oop_127511_vierza.week14.latihan

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class UserService {
    private val db = MySQLDatabase()
    fun getUser(id: Int) =
        db.query("SELECT * FROM users WHERE id = $id")
}