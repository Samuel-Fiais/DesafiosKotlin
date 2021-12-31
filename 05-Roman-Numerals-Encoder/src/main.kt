fun main() {
    val test = encode(2388)
    println(test)
}

fun encode(num: Int): String {
    // Here are the variables with the Roman numerals
    val strNum: String = num.toString()
    var str = ""
    val symbolRoman1 = listOf("I", "X", "C", "M")
    val symbolRoman2 = listOf("II", "XX", "CC", "MM")
    val symbolRoman3 = listOf("III", "XXX", "CCC", "MMM")
    val symbolRoman4 = listOf("IV", "XL", "CD")
    val symbolRoman5 = listOf("V", "L", "D")
    val symbolRoman6 = listOf("VI", "LX", "DC")
    val symbolRoman7 = listOf("VII", "LXX", "DCC")
    val symbolRoman8 = listOf("VIII", "LXXX", "DCCC")
    val symbolRoman9 = listOf("IX", "XC", "CM")
    for (ind in strNum.indices){
        when (strNum[ind]) {
            '1' -> str = str.plus(symbolRoman1[strNum.length - ind - 1])
            '2' -> str = str.plus(symbolRoman2[strNum.length - ind - 1])
            '3' -> str = str.plus(symbolRoman3[strNum.length - ind - 1])
            '4' -> str = str.plus(symbolRoman4[strNum.length - ind - 1])
            '5' -> str = str.plus(symbolRoman5[strNum.length - ind - 1])
            '6' -> str = str.plus(symbolRoman6[strNum.length - ind - 1])
            '7' -> str = str.plus(symbolRoman7[strNum.length - ind - 1])
            '8' -> str = str.plus(symbolRoman8[strNum.length - ind - 1])
            '9' -> str = str.plus(symbolRoman9[strNum.length - ind - 1])
            else -> Unit
        }
    }
    return str
}