package barbato.giba.collection

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1200.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
    println(repositorio.findById(maria.nome))


    println("-------------FIND ALL -------------")
    repositorio.findAll().forEach { println(it) }


    println("-------------Remove -------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}
