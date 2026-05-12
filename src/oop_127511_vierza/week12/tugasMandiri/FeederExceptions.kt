package oop_127511_vierza.week12.tugasMandiri

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) :
    FeederException("Kibble tidak cukup! Diminta ${requested}gr, " +
            "sisa ${available}gr")

class DispenserJamException :
    FeederException("Wadah dispenser macet!")