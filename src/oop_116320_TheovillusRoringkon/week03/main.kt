package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week03

fun main () {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.salary}")
}