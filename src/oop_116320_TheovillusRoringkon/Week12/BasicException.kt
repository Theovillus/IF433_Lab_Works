package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.Week12

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}