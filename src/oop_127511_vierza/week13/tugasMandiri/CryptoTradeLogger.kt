package oop_127511_vierza.week13.tugasMandiri

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCSV(): String =
    "$id,$symbol,$type,$margin,$pnl"