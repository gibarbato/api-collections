package barbato.giba.collection

fun main() {
    val joao = Funcionario("Joao", 1000.0)
    val maria = Funcionario("Maria", 2000.0)
    val pedro = Funcionario("Pedro", 4000.0)

    val funcionarios = listOf(joao,pedro,maria)

    println("----------DATA CLASS---------")
    funcionarios.forEach{println(it)}
    println("----------------------")

    println("----------FIND---------")
    println(funcionarios.find{it.nome == "Maria"})
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