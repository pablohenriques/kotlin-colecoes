package list

fun main() {
    val l1 = Livro(titulo = "A", autor = "A", anoPublicacao = 4, editora = "A")
    val l2 = Livro(titulo = "B", autor = "B", anoPublicacao = 3, editora = "B")
    val l3 = Livro(titulo = "C", autor = "C", anoPublicacao = 2, editora = "C")
    val l4 = Livro(titulo = "D", autor = "D", anoPublicacao = 1, editora = "D")

    val livros: MutableList<Livro> = mutableListOf(l1, l2, l3, l4)


    val novoLivro = Livro(titulo = "E", autor = "E", anoPublicacao = 1, editora = "E")
    livros.add(novoLivro)

    livros.imprimeComMarcadores()
//    println(livros)

    livros.removeAt(1)
//    println(livros)
    livros.imprimeComMarcadores()

    val ordenadoPorAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoPorAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    val titulos: List<String> = livros
//        .filter { it.autor == "A" }
        .filter { it.autor.startsWith("B") }
        .sortedBy { it.anoPublicacao }
//        .imprimeComMarcadores()
        .map { it.titulo }

    println(titulos)
}

