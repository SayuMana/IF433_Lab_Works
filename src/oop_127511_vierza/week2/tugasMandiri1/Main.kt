package oop_127511_vierza.week2.tugasMandiri1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku: ")
    val judul = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama pinjam: ")
    var loanDuration = scanner.nextInt()

    scanner.nextLine()

    if (loanDuration < 0) {
        print("Lama pinjam (${loanDuration}) tidak boleh minus/0. Otomatis lama pinjam 1 hari")
        loanDuration = 1
    }

    var loan = Loan(judul, borrower, loanDuration)
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama pinjam: ${loan.bookTitle}")
    loan.calculateFine()
}