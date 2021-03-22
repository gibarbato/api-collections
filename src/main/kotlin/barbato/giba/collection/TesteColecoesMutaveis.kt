package barbato.giba.collection

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1200.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    println("---------LIST----------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {println(it)}

    println("---------LIST----------")
    println("----ADD um novo funcinario------")
    funcionarios.add(pedro)
    funcionarios.forEach {println(it)}

    println("-------------------")
    println("----REMOVE um funcinario------")
    funcionarios.remove(joao)
    funcionarios.forEach {println(it)}

    println("-------------------")
    println("----SET------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach {println(it)}

    println("-------------------")
    println("----ADD um novo funcinario------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("-------------------")
    println("----REMOVE um funcinario------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }



}