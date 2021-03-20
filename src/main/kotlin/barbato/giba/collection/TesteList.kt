package barbato.giba.collection

fun main() {
    val joao = Funcionario("Joao", 2000.0)
    val maria = Funcionario("Maria", 1200.0)
    val pedro = Funcionario("Pedro", 4000.0)

    val funcionarios = listOf(joao,pedro,maria)

    println("----------DATA CLASS---------")
    funcionarios.forEach{println(it)}
    println("----------------------")

    println("----------FIND---------")
    println(funcionarios.find{it.nome == "Maria"})
    println("----------------------")

    println("----------SORT BY / forEach - salário---------")
    funcionarios
        .sortedBy{it.salario}
        .forEach { println(it) }
    println("----------------------")


}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
    """
        Nome:    $nome
        Salario: $salario
    """.trimIndent()

}