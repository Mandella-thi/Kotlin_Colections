package one.digitalInovation.Colection

fun main() {
    val joao= Funcionario (nome = "joão", salario = 2000.0, tipoContratacao = "CLT")
    val pedro= Funcionario (nome = "pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria= Funcionario (nome = "maria", salario = 4000.0, tipoContratacao = "CLT")
    println("==============List==================")
    val funcionarios= mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }
    println("===================================")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("===================================")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }
    println("============Set====================")
    val funcionarioSet =mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }
    println("===================================")
    funcionarioSet.add(maria)
    funcionarioSet.add(pedro)
    funcionarioSet.forEach { println(it) }
    println("===================================")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}