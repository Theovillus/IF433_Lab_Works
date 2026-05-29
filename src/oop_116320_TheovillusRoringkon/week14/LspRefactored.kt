package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week14

interface Shape {
    fun area(): Int
}
class SafeRectangle(var width: Int, var height: Int) : Shape {
    override fun area() = width * height
}

class SafeSquare(var side: Int) : Shape {
    override fun area() = side * side
}