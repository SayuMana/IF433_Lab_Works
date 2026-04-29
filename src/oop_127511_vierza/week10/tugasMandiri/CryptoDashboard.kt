package oop_127511_vierza.week10.tugasMandiri

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 250.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status : ${response.status}")
    response.data.forEach { coin ->
        println("Nama: ${coin.name}, Saldo: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-9901A", 500.0))
    txRepo.add(Transaction("TX-9902B", 125.5))

}