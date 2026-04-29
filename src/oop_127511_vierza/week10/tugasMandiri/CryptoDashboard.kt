package oop_127511_vierza.week10.tugasMandiri

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 250.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
}