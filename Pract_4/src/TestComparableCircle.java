public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5, "red", true);
        ComparableCircle c2 = new ComparableCircle(3, "blue", false);

        System.out.println("c1.compareTo(c2) = " + c1.compareTo(c2));
        System.out.println("Наибольший из двух кругов: " + ComparableCircle.max(c1, c2));



        ComparableCircle circle = new ComparableCircle(3, "green", true);
        Rectangle rect = new Rectangle(4, 5, "orange", false);

        int cmp = circle.compareTo(rect);
        System.out.println("\ncircle.compareTo(rect) = " + cmp);

        GeometricObject winner = (cmp >= 0) ? circle : rect;
        System.out.println("Наибольший между кругом и прямоугольником: " + winner);
        System.out.println("Его площадь: " + winner.getArea());


        System.out.println("rect.compareTo(circle) = " + rect.compareTo(circle));
    }
}