package oop_127511_vierza.week10.tugasMandiri

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll() : List<T> {
        return items
    }
}