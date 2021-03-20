package barbato.giba.collection

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1200.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)

    println("---------UNION----------")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }
    println("------------------------")

    println("---------SUBTRACT----------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(other = funcionarios1)
    resultSubtract.forEach { println(it) }
    println("------------------------")

    println("---------INTERSECT----------")
    val resultIntersect = funcionarios3.intersect(other = funcionarios2)
    resultIntersect.forEach { println(it) }
    println("------------------------")
}