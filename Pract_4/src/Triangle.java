public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;


    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        super();
        setSides(side1, side2, side3);
    }

    public Triangle(double side1, double side2, double side3,
                    String color, boolean filled)
            throws IllegalTriangleException {
        super(color, filled);
        setSides(side1, side2, side3);
    }

    private void setSides(double a, double b, double c)
            throws IllegalTriangleException {
        if (!isTriangle(a, b, c)) {
            throw new IllegalTriangleException(
                    "Стороны " + a + ", " + b + ", " + c
                            + " не образуют треугольник");
        }
        side1 = a;
        side2 = b;
        side3 = c;
    }


    public static boolean isTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a;
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Формула Герона: s — полу периметр. */
    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "Треугольник: сторона1=" + side1
                + ", сторона2=" + side2
                + ", сторона3=" + side3
                + "; " + super.toString();
    }
}