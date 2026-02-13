package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week02

// File: main.kt
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- PINJAM BUKU DENDA MAHAL ---")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val name = scanner.nextLine()

    print("Masukkan Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()

    // Validasi sesuai instruksi: Jika minus, otomatis ubah jadi 1
    if (duration < 0) {
        println("WARNING: Lama pinjam tidak boleh minus. Diubah menjadi 1 hari.")
        duration = 1
    }

    // Membuat objek Loan
    val loanEntry = Loan(title, name, duration)

    // Menampilkan Detail
    println("\n--- Detail Peminjaman ---")
    println("Judul Buku   : ${loanEntry.bookTitle}")
    println("Peminjam     : ${loanEntry.borrower}")
    println("Lama Pinjam  : ${loanEntry.loanDuration} hari")
    println("Total Denda  : Rp ${loanEntry.calculateFine()}")
}