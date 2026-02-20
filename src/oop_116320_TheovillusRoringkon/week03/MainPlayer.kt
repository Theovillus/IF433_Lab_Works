package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week03

fun main() {

    print("Masukkan username: ")
    val username = readLine() ?: "Player"

    val player = Player(username)

    while (true) {
        print("Masukkan XP yang mau ditambah (0 untuk keluar): ")
        val input = readLine()?.toIntOrNull() ?: 0

        if (input == 0) break

        player.addXp(input)

        println("Level sekarang: ${player.level}")
    }
    println("Program selesai.")
}