package oop_127511_vierza.week14.latihan

interface MultifunctionDevice {
    fun print(doc: String)
    fun scan(doc: String): String
    fun fax(doc: String)
}

class SimplePrinter : MultifunctionDevice {
    override fun print(doc: String) =
        println("Printing $doc")

    override fun scan(doc: String) =
        throw UnsupportedOperationException("No Scanner")

    override fun fax(doc: String) =
        throw UnsupportedOperationException("No Fax")
}