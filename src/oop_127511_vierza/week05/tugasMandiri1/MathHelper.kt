package oop_127511_vierza.week05.tugasMandiri1
import kotlin.math.PI // Peganti 3.14

abstract class MathHelper {
    fun hitungLuas(sisi: Int): Int {
        return (sisi * sisi)
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return (panjang * lebar)
    }

    fun hitungLuas(jariJari: Double): Double {
        return (PI * jariJari * jariJari)
    }
}