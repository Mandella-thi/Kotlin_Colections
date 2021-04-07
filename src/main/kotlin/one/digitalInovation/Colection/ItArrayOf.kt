package one.digitalInovation.Colection

fun main() {
    val values = intArrayOf(2,3,4,3,10,7)

    values.forEach {
        println(it)
    }
    println("===================================")
values.sort()
    values.forEach {
        println(it)
    }
}