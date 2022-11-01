fun main(args: Array<String>) {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade: Int? = idades.maxOrNull()
    println(maiorIdade)

    val menorIdade: Int? = idades.minOrNull()
    println("Menor idade da lista: $menorIdade")

    val mediaIdades: Double = idades.average()
    println("Maior idade da lista: $mediaIdades")

    val maiorIdades = idades.all { it >= 18 }
    println("Todos são maiores de idade: $maiorIdades")

    val umMaiorIdade = idades.any { it>= 18 }
    println("Existe alguém maior de idade: $umMaiorIdade")

    val listMaiorIdade = idades.filter { it >= 18 }
    println("Maiores de idade: $listMaiorIdade")

    val busca = idades.find { it >= 18 }
    println("Busca de valores: $busca")
}