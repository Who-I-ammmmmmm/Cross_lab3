import java.util.Scanner;

public class Task2 {

    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення a:");
        double a = scanner.nextDouble();

        System.out.println("Введіть значення b:");
        double b = scanner.nextDouble();

        System.out.println("Введіть значення c:");
        double c = scanner.nextDouble();

        System.out.println("Введіть значення d:");
        double d = scanner.nextDouble();

        double stepX = (b - a) / 7; // Крок для x
        double stepY = (d - c) / 7; // Крок для y

        System.out.print("\t");
        double currentX = a;
        while (currentX <= b) {
            System.out.printf("%.2f\t", currentX);
            currentX += stepX;
        }
        System.out.println();

        double currentY = c;
        while (currentY <= d) {
            System.out.printf("%.2f\t", currentY);
            double innerCurrentX = a;
            while (innerCurrentX <= b) {
                double u = Math.sqrt(3 * innerCurrentX * innerCurrentX + 2 * currentY * currentY);
                System.out.printf("%.2f\t", u);
                innerCurrentX += stepX;
            }
            currentY += stepY;
            System.out.println();
        }
    }
}
