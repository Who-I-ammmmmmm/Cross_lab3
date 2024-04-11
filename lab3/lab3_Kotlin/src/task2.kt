import kotlin.math.sqrt
import java.util.Scanner

fun task2() {
    val scanner = Scanner(System.`in`)

    println("Введіть значення a:")
    val a = scanner.nextDouble()

    println("Введіть значення b:")
    val b = scanner.nextDouble()

    println("Введіть значення c:")
    val c = scanner.nextDouble()

    println("Введіть значення d:")
    val d = scanner.nextDouble()

    val stepX = (b - a) / 7 // Крок для x
    val stepY = (d - c) / 7 // Крок для y

    print("\t")
    var currentX = a
    while (currentX <= b) {
        print("%.2f\t".format(currentX))
        currentX += stepX
    }
    println()

    var currentY = c
    while (currentY <= d) {
        print("%.2f\t".format(currentY))
        var currentX = a
        while (currentX <= b) {
            val u = sqrt(3 * currentX * currentX + 2 * currentY * currentY)
            print("%.2f\t".format(u))
            currentX += stepX
        }
        currentY += stepY
        println()
    }
}
