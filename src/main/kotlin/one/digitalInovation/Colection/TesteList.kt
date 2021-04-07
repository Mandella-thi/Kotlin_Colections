package one.digitalInovation.Colection

fun main() {
    val joao= Funcionario (nome = "joão", salario = 1000.0)
    val pedro= Funcionario (nome = "pedro", salario = 1000.0)
    val maria= Funcionario (nome = "maria", salario = 1000.0)

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach{println(it)}
    println("==============================")
    println(funcionarios.find { it.nome== "maria" })
}
data class Funcionario(
    val nome: String,
    val salario: Double
){
override fun toString(): String=
    """
        Nome: $nome
        Salario: $salario
    """.trimIndent()

}