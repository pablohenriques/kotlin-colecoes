import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "10000.00", "3500.00", "5050.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = "6".toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        (acumulador + salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

//    val salarioOrdenado = salariosComAumento.sorted()
//    val tresUltimosSalarios: Array<BigDecimal> = salarioOrdenado.takeLast(3).toTypedArray()
//    val media = tresUltimosSalarios.media()
    //val media = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    val media = salariosComAumento.sorted().take(3).toTypedArray().media()
//    println("tres: $tresUltimosSalarios")
    println("media: $media")

}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
