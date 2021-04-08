package one.digitalInovation.Colection

fun main() {
    val joao= Funcionario (nome = "joão", salario = 2000.0, tipoContratacao = "CLT")
    val pedro= Funcionario (nome = "pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria= Funcionario (nome = "maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach{println(it)}
    println("==============================")
    println(funcionarios.find { it.nome== "maria" })
    println("================================")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("================================")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
override fun toString(): String=
    """
        Nome: $nome
        Salario: $salario
    """.trimIndent()

}