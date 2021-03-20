package barbato.giba.collection

fun main() {
    val values = IntArray(5)

    values[0] = 9
    values[1] = 4
    values[2] = 10
    values[3] = 3
    values[4] = 5

    for (valor in values){
        println(valor)
    }

    println("")
    println("---------------")
    println("feito com forEach")
    values.forEach { valor2 ->
        print(valor2)
    }


    println("")
    println("---------------")
    println("feito com values.indices")
    for (index in values.indices){
        println(values[index])
    }
    println("")
    println("---------------")
    println("feito com SORT")
    values.sort()
    for (valor3 in values){
        println(valor3)
    }

}