package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week07

fun main() {

    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}