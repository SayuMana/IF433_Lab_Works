package oop_127511_vierza.week12.tugasMandiri

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0gr"
    }

    if (isJammed) throw DispenserJamException()
    if (requestedGram > availableGram) throw FoodEmptyException(requestedGram, availableGram)

    println("Kibble berhasil dikeluarkan! Sisa stock: ${availableGram - requestedGram}")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    var simulationPagi = try {
        dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai")
    }

    var simulationSore = runCatching {
        dispenseKibble(30, 1000, false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore success! Sisa stock kibble: ${currentKibbleStock}gr")
    }
}