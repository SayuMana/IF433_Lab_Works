package oop_127511_vierza.week10.tugasMandiri

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll() : List<T> {
        return items
    }

    fun findByName(searchName: String) : T? {
        return items.find { item ->
            if (item is NamedItem) {
                item.name.equals(searchName, ignoreCase = true)
            } else {
                false
            }
        }
    }
}