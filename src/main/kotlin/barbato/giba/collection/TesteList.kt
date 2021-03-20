package barbato.giba.collection

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1200.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

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

    println("----------Group BY / forEach - tipo contratação ---------")
    funcionarios
        .groupBy{it.tipoContratacao}
        .forEach { println(it) }
    println("----------------------")
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
    """
        Nome:    $nome
        Salario: $salario
        Tipo Contrato: $tipoContratacao
    """.trimIndent()

}