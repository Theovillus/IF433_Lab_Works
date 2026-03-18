package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {

    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}