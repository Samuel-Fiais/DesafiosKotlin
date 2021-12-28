import kotlin.math.pow

fun main() {
    val number = rowSumOddNumbers(2)
    println(number)
}

fun rowSumOddNumbers(n: Int): Int {
    return n.toDouble().pow(3.0).toInt()
}
