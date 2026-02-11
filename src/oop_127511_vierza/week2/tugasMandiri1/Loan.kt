package oop_127511_vierza.week2.tugasMandiri1

class Loan (
    var bookTitle: String,
    var borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        var denda = 0

        if (loanDuration > 3) {
            denda = (loanDuration - 3) * 2000
            println("Anda dikenakan denda: ${denda}")
        }
        else if (loanDuration < 3) {
            denda = 0
            println("Anda mengembalikan tepat waktu")
        }
        return denda
    }
}