package oop_127511_vierza.week13.tugasMandiri
import oop_127511_vierza.week13.latihan.fromCSV
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCSV(): String =
    "$id,$symbol,$type,$margin,$pnl"

fun fromCSVTrade(line: String) : TradeRecord?{
    return try {
        val parts = line.split(",")
        return TradeRecord(
            parts[0].toInt(),
            parts[1],
            parts[2],
            parts[3].toDouble(),
            parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("Log: Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { out ->
        trades.forEach {
            out.println(it.toCSV())
        }
    }
}

fun loadTrades(path: String) : List<TradeRecord?> {
    return try {
        File(path).readLines().map { fromCSVTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error!")
        emptyList()
    }
}