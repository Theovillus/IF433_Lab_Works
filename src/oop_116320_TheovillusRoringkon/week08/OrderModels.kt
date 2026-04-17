package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)