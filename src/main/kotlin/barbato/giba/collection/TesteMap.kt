package barbato.giba.collection

fun main() {


    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    println("---------mapOf-01----------")
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf(
        "Pedro" to 2500.6,
        "Maria" to 3000.0
    ) //infix
    println("---------mapOf-02----------")
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")}

}
