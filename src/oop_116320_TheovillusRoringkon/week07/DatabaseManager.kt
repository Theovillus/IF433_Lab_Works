package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}