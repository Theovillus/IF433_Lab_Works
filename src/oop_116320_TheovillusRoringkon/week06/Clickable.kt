package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week06

interface Clickable {
    val name : String
    fun click()

    class Button (override val name: String) : Clickable {
        override fun click() {
            println("Tombol '$name' berhasil di click")
        }
    }
}