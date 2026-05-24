package oop_127511_vierza.week14.latihan

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String) =
        listOf("pg_data1", "pg_data2")
}