fun main() {
    val ages = nbYear(1500000, 2.5, 10000, 2000000)
    println(ages)
}

fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
    var age = 0
    var currentPp: Int = pp0
    while (currentPp < p) {
        currentPp = (currentPp + (currentPp * percent / 100) + aug).toInt()
        age++
    }
    return age
}