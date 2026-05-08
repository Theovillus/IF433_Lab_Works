package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}