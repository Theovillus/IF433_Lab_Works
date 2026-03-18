package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV $name dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam.")
    }
}