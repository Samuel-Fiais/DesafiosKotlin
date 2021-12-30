fun main() {
    val test = nbDig(5750, 0)
    println(test)
}

fun nbDig(n:Int, d:Int):Int {
    var qtd1: Int = 0
    var power: Int
    var str: Int
    if (d in 0..9 && n >= 0) {
        for (num in 0..n) {
            power = num * num
            str = power.toString().length - power.toString().replace("$d", "").length
            qtd1 += str.toInt()
        }
    }
    return qtd1
}
