package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Error gaji tidak boleh negatif Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}