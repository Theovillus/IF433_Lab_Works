package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week10

import sun.management.MemoryUsageCompositeData.getMax

fun main(processData: (String) -> Unit) {
    println("=== TEST GENERIC CLASS ===")
        val intBox = Box(100)
        val stringBox = Box ("Generics in kotlin")

        println("Isi intBox: ${intBox.value}")
        println("Isi StringBox: ${stringBox.value}")

        println ("\n=== TEST MULTIPLE PARAMETERS ===")
        val itemPrice = PairBox("Bitcoin", 65000)
        println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

        println("\n=== TEST GENERIC FUNCTIONS ===")
        printData(3.14)
        val result = processData("stable coin")
        println("Hasil Proses : $result")

        println("\n=== TEST CONSTRAINTS ===")
        val math = MathBox(10.5, 20)
        println("Total: ${math.sum()}")
        println("Terbesar: ${ getMax (45, 90)}")
}
