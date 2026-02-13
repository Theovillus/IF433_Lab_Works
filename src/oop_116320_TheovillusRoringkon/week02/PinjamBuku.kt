package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 1000000
        } else {
            0
        }
    }
}