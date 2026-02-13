package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week02

class student (val name : String, val nim : String, var major : String)
    { init {
        if (nim.length !=5) {
            println("WARNING Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di memory.")
        }
    }
}