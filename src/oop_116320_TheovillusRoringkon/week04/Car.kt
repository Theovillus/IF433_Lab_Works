package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

}