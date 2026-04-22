package oop_127511_vierza.week09.tugasMandiri

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, 8.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 15, -2.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 12, 3.1, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 30, 10.2, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    println("\nClosed Trades")
    closedTrades.forEach { println(it) }

    val winningTrades = tradeHistory.filter { it.roe > 0 }
    println("\nWinning Trades")
    winningTrades.forEach { println(it) }

    val losingTrades = closedTrades.filter { it.roe <= 0 }
    println("\nLosing Trades")
    winningTrades.forEach { println(it) }

    val topPerformerString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}] : +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    println("\nTop Performers Trades")
    topPerformerString.forEach { println(it) }

    val worstPerformerString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}] : ${it.roe}% ROE (Lev: ${it.leverage}x)" }
    println("\nWorst Performers Trades")
    worstPerformerString.forEach { println(it) }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
    println("\nUnique Pairs")
    println(uniquePairs)
}