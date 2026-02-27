package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week04

fun main() {

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar(
        brand = "Ioniq 5N",
        numberOfDoors = 4,
        batteryCapacity = 1000
    )
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
    println("\n--- Testing Manager ---")
    val manager = Manager("Andi", 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer("Budi", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
