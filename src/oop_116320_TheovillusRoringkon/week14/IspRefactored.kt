package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}
class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing securely: $doc")
}