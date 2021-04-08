package one.digitalInovation.Colection

fun main() {
    val joao= Funcionario (nome = "joão", salario = 2000.0, tipoContratacao = "CLT")
    val pedro= Funcionario (nome = "pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria= Funcionario (nome = "maria", salario = 4000.0, tipoContratacao = "CLT")

    val repositorio =Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))
}
