package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week02

fun main() {

    print("Masukkan nama Hero: ")
    val inputName = readLine() ?: "Unknown"

    print("Masukkan Base Damage: ")
    val inputDamage = readLine()?.toIntOrNull() ?: 15

    val myHero = Hero(inputName, inputDamage)
    var enemyHp = 100
    val enemyName = "Slime"

    println("\n=== BATTLE START: ${myHero.name} VS $enemyName ===")


    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- Status ---")
        println("HP ${myHero.name}: ${myHero.hp}")
        println("HP $enemyName: $enemyHp")

        println("Menu: 1. Serang, 2. Kabur")
        print("Pilih aksi: ")
        val choice = readLine()

        if (choice == "1") {

            myHero.attack(enemyName)
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP $enemyName: $enemyHp")

            if (enemyHp > 0) {
                val randomDamage = (10..20).random()
                println("$enemyName menyerang balik!")
                myHero.takeDamage(randomDamage)
                println("Sisa HP ${myHero.name}: ${myHero.hp}")
            }
        }
        else if (choice == "2") {
            println("${myHero.name} melarikan diri dari pertempuran...")
            break
        }
        else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== PERTANDINGAN BERAKHIR ===")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} berhasil mengalahkan $enemyName!")
    } else if (!myHero.isAlive()) {
        println("Sayang sekali, ${myHero.name} telah dikalahkan...")
    } else {
        println("Pertarungan berakhir karena anda kabur.")
    }
}