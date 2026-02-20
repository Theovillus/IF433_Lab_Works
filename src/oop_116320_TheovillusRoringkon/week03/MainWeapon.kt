package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week03

fun main() {

    print("Masukkan nama senjata: ")
    val weaponName = readLine() ?: "Unknown"

    val weapon = Weapon(weaponName)

    print("Masukkan damage: ")
    val dmgInput = readLine()?.toIntOrNull() ?: 0

    weapon.damage = dmgInput

    println("Nama: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}