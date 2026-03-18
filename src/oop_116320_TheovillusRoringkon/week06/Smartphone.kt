package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week06

class Smartphone : Camera, Phone  {

    override fun turnOn (){
        super<Camera>.turnOn ()
        super<Phone>.turnOn ()
        println("Sistem operasi smarthphone berhasil di booting. ")
    }
}