package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}
fun main() {
    var currentKibbleStock = 50
    try {
        println("\n--- JADWAL MAKAN 1 (Pagi) ---")
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("Error Umum: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
    println("\n--- PEMILIK MENGISI ULANG STOK ---")
    currentKibbleStock = 1000

    val result = runCatching {
        dispenseKibble(requestedGram = 30, availableGram = currentKibbleStock, isJammed = false)
    }
    result.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }
    result.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
    println("\n=== SEMUA PROSES SELESAI ===")
}