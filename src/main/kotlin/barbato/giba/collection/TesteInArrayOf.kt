package barbato.giba.collection

fun main() {

    println("intArrayOf - for Each")
    val values = intArrayOf(2, 9, 1, 30, 5, 8)

    values.forEach {
        println(it)
    }

    println("-----------------")
    println("intArrayOf - sort")
    values.sort()
    values.forEach {
        println(it)
    }
}