package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week10

fun main () {
    println("=== TEST GENERIC CLASS ===")
        val intBox = Box(100)
        val stringBox = Box ("Generics in kotlin")

        println("Isi intBox: ${intBox.value}")
        println("Isi StringBox: ${stringBox.value}")
}
