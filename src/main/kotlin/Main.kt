fun main(args: Array<String>) {
    val idades = IntArray(5)
    var maiorIdade = 0

    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
    idades[4] = 50

    for(idade in idades) {
        if(idade > maiorIdade) {
            maiorIdade = idade
        }
        println(idade)
    }

    println("Maior Idade: $maiorIdade")
}