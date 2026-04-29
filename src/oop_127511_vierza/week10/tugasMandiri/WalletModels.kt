package oop_127511_vierza.week10.tugasMandiri

interface NamedItem {
    val name: String
}

data class Coin(
    override val name: String,
    val balance: Double
) : NamedItem

data class Transaction(
    val id: String,
    val amount: Double
)