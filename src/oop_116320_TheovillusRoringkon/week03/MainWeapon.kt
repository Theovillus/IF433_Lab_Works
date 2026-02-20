package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week03

fun main() {
    val weapon = Weapon("Dragon Slayer")

    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")

    println("Tier: ${weapon.tier}")
}