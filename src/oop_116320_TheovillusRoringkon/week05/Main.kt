package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }

    println("\n=== TEST MATH HELPER ===")

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(4)
    println("Luas Persegi: $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
    println("Luas Persegi Panjang: $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran: $luasLingkaran")

    println("\n=== SISTEM PEMBAYARAN ===")

    val ewallet = EWallet("Theo", 50000.0)
    val creditCard = CreditCard("Theo", 100000.0)

    val daftarMetode: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (metode in daftarMetode) {

        metode.processPayment(75000.0)


        if (metode is EWallet) {
            println("Saldo kurang, melakukan top up...")
            metode.topUp(50000.0)

            println("Coba pembayaran lagi...")
            metode.processPayment(75000.0)
        }

        println("--------------------------")
    }
}
