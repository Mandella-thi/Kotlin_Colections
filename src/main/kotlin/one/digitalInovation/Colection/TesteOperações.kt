package one.digitalInovation.Colection

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4080.0)

    for (salario in salarios){
        println(salario)
    }
    println("==========================")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("menor salário: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")
println("=========================")
    val salariosMaiorQue2500 = salarios.filter { it>2500.0 }
    salariosMaiorQue2500.forEach{println(it)}
}