package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik Parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}