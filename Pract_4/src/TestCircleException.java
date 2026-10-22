public class TestCircleException {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(-5);
            Circle c3 = new Circle(0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Исключение: " + ex.getMessage());
        }
        System.out.println("Количество созданных объектов: "
                + Circle.getNumberOfObjects());
        System.out.println("Программа продолжена после catch.");
    }
}