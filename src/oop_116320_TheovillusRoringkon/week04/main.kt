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

}
