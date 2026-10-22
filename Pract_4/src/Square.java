public class Square extends GeometricObject implements Colorable {
    private double side;


    public Square() {
        this(0);
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() { return side; }

    public void setSide(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Сторона не может быть отрицательной");
        }
        this.side = side;
    }

    @Override
    public double getArea() { return side * side; }

    @Override
    public double getPerimeter() { return 4 * side; }

    @Override
    public void howToColor() {
        System.out.println("Раскрасить все четыре стороны.");
    }

    @Override
    public String toString() {
        return "Квадрат: сторона=" + side + "; " + super.toString();
    }
}