public class TestMax {
    public static void main(String[] args) throws IllegalTriangleException {
        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(5, 12, 13);

        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3);

        System.out.println("Наибольший треугольник: "
                + GeometricObject.max(t1, t2));
        System.out.println("Его площадь: "
                + GeometricObject.max(t1, t2).getArea());

        System.out.println("Наибольший круг: "
                + GeometricObject.max(c1, c2));
        System.out.println("Его площадь: "
                + GeometricObject.max(c1, c2).getArea());
    }
}