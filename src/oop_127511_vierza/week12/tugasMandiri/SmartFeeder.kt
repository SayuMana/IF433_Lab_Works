package oop_127511_vierza.week12.tugasMandiri

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0gr"
    }

    if (isJammed) throw DispenserJamException()
    if (requestedGram > availableGram) throw FoodEmptyException(requestedGram, availableGram)

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}