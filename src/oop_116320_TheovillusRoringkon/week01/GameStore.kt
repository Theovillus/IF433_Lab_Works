package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week01

fun main() {
    val gameTitle = "Resident Evil 4 Remake"
    val price = 600000

    fun calculateDiscount(price: Int): Int = if (price > 500000) {
        (price * 0.20).toInt()
    } else {
        (price * 0.10).toInt()
    }
}