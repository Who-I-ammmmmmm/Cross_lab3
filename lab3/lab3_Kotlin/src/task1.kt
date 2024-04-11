import java.util.Scanner

fun task1() {
    val scanner = Scanner(System.`in`)
    var x: Double
    var u: Double
    var s = 1.0
    val eps = 0.00001
    println("Введіть значення x")
    x = scanner.nextDouble()
    u = x / 4
    var n = 2
    while (Math.abs(u) > eps) {
        s += u
        u *= -x * (4 * n - 5).toDouble() / (4 * n)
        n++
    }
    println("Значення суми s = %.6f".format(s))
    println("Значення функції: %.6f".format(Math.pow(1 + x, 0.25)))
    println("Кількість доданків " + (n - 1))
}
