package oop_127511_vierza.week09.tugasMandiri

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double, // Return on Equity
    val status: String
)