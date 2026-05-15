package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.Week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")