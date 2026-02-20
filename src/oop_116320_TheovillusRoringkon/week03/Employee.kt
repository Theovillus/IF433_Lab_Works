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


    private var performanceRating: Int = 3
    val tax : Double
        get() = salary *0.1
    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan : $name, rating: $performanceRating")
    }
}