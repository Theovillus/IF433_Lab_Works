package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week05

abstract class PaymentMethod (
    val accountName : String
) {
    abstract fun processPayment(amount: Double)
}