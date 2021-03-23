package barbato.giba.collection

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
        )



    println("-----chamando fun somatoria()------")
    println(salarios.somatoria())
    println("-----chamando fun media()------")
    println(salarios.media())
}