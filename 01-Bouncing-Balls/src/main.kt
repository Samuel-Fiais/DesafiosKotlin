fun main() {
    val ballUser = bouncingBall(2.0, 0.5, 1.0)
    println(">>> $ballUser")
}

fun bouncingBall(h:Double, bounce:Double, window:Double):Int {
    return if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
        var ballSight = 0
        var ballHeight = h
        while (ballHeight > window) {
            ballSight++
            ballHeight *= bounce
            if (ballHeight > window) {
                ballSight++
            }
        }
        ballSight
    } else {
        -1
    }
}