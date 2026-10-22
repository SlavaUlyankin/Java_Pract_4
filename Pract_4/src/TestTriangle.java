import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Triangle defaultTriangle = new Triangle();
        System.out.println("Треугольник по умолчанию: " + defaultTriangle);
        System.out.println("Площадь: " + defaultTriangle.getArea());
        System.out.println("Периметр: " + defaultTriangle.getPerimeter());
        System.out.println();

        System.out.print("Введите три стороны (через пробел, дробные — через точку): ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        System.out.print("Введите цвет: ");
        String color = in.next();

        System.out.print("Заполненный? (true/false): ");
        boolean filled = in.nextBoolean();

        checkTriangle(a, b, c, color, filled);

        // Демонстрация невозможного треугольника
        checkTriangle(1, 2, 3, "red", false);

        in.close();
    }

    private static void checkTriangle(double a, double b, double c,
                                      String color, boolean filled) {
        System.out.println("\nСтороны " + a + ", " + b + ", " + c
                + " образуют треугольник: " + Triangle.isTriangle(a, b, c));
        try {
            Triangle t = new Triangle(a, b, c, color, filled);
            System.out.println(t);
            System.out.println("Площадь: " + t.getArea());
            System.out.println("Периметр: " + t.getPerimeter());
        } catch (IllegalTriangleException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}