package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()

    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}