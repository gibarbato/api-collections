package barbato.giba.collection

import kotlin.collections.max as max

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.5)

    for(salario in salarios){
        println(salario)
    }

    println("----------------------")
    //println("Maior salario: ${salarios.max()}") - operação depreciada
    println("Maior salario: ${salarios.maxOrNull()}")
    //println("Menor salario: ${salarios.min()}") - operação depreciada
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")



    println("----------------------")
    println("FILTROS")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("salarios Maior Que 2500")
    salariosMaiorQue2500.forEach(){println(it)}

    val salariosMenorQue2500 = salarios.filter { it < 2500.0 }
    println("salarios Menor Que 2500")
    salariosMenorQue2500.forEach(){println(it)}

    println("----------------------")
    println("COUNT - RANGE")
    println(salarios.count { it in 2000.00..5000.0 })

    println("----------------------")
    println("FIND")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 2850.0 })

    println("----------------------")
    println("ANY")
    println(salarios.any {it == 1000.00})
    println(salarios.any {it == 500.00})
}