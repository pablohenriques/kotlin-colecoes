fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1

    var indice = 0
    for(salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }
    println(salarios.contentToString())

}