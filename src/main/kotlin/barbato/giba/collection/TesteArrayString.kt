package barbato.giba.collection

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Almir"
    nomes[2] = "Jose"

    for (nome in nomes) {
        println(nome)
    }

    println("-------------------")
    println("Teste Array String - sort - forEach")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-------------------")
    println("Teste ArrayOf - sort - forEach")
    val nomes2 = arrayOf("Maia", "Ayla", "George")
    nomes2.sort()
    nomes2.forEach { println(it) }
}
