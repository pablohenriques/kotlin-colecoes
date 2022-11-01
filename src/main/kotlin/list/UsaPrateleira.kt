package list

fun main() {
    val l1 = Livro(titulo = "A", autor = "A", anoPublicacao = 4, editora = "A")
    val l2 = Livro(titulo = "B", autor = "B", anoPublicacao = 3, editora = "B")
    val l3 = Livro(titulo = "C", autor = "C", anoPublicacao = 2, editora = "C")
    val l4 = Livro(titulo = "D", autor = "D", anoPublicacao = 1, editora = "D")
    val livros: MutableList<Livro> = mutableListOf(l1, l2, l3, l4)

    val prateleira: Prateleira = Prateleira(genero="Literatura", livros = livros)

//    prateleira.organizarPorAutor().imprimeComMarcadores()
//    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}