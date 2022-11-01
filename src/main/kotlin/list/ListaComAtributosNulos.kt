package list

fun main() {
    val l1 = Livro(titulo = "A", autor = "A", anoPublicacao = 4, editora = "A")
    val l2 = Livro(titulo = "B", autor = "B", anoPublicacao = 3, editora = "B")
    val l3 = Livro(titulo = "C", autor = "C", anoPublicacao = 2, editora = "C")
    val l4 = Livro(titulo = "D", autor = "D", anoPublicacao = 1, editora = "D")
    val l5 = Livro(titulo = "D", autor = "D", anoPublicacao = 1)
    val livros: MutableList<Livro> = mutableListOf(l1, l2, l3, l4, l5)

    livros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach{ (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}