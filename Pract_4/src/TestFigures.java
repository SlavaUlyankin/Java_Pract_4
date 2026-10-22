public class TestFigures {
    public static void main(String[] args) throws IllegalTriangleException {
        GeometricObject[] figures = {
                new Square(3, "red", true),
                new Circle(2, "blue", false),
                new Rectangle(4, 5, "green", true),
                new Triangle(3, 4, 5, "black", false),
                new Square()
        };

        for (GeometricObject figure : figures) {
            System.out.println(figure);
            System.out.println("Площадь: " + figure.getArea());

            if (figure instanceof Colorable) {
                ((Colorable) figure).howToColor();
            }
            System.out.println();
        }
    }
}