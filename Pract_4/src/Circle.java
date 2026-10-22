public class Circle extends GeometricObject {
    private double radius = 1.0;
    private static int numberOfObjects = 0;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this(radius, "white", false);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);          // может бросить IllegalArgumentException
        numberOfObjects++;
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException(
                    "Радиус не может быть отрицательным: " + radius);
        }
        this.radius = radius;
    }

    public static int getNumberOfObjects() { return numberOfObjects; }

    @Override
    public double getArea() { return radius * radius * Math.PI; }

    @Override
    public double getPerimeter() { return 2 * radius * Math.PI; }

    @Override
    public String toString() {
        return "Круг: радиус=" + radius + ", площадь=" + getArea()
                + "; " + super.toString();
    }
}