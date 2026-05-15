package oop_116320_TheovillusRoringkon.week01.oop_116320_TheovillusRoringkon.Week12

sealed class FeederException(msg: String) : Exception(msg)
class FoodEmptyException(requested: Int, available: Int) :
    FeederException("Kibble tidak cukup! Diminta ${requested} gr, sisa ${available} gr")

class DispenserJamException :
    FeederException("Wadah dispenser tersangkut/macet!")