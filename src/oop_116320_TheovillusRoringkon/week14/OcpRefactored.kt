package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week14

interface DiscountStrategy {
    fun apply(price: Double): Double
}

class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.80
}

class MemberDiscount : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.85
}