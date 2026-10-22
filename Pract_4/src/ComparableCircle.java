/**
 * Тот же параметр Comparable<GeometricObject>, что и у предка:
 * Java запрещает наследовать Comparable с разными тип-аргументами
 * в одной иерархии (ComparableCircle уже наследует его через Circle).
 */
public class ComparableCircle extends Circle
        implements Comparable<GeometricObject> {

    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    /** Круги сравниваем по радиусу, прочие фигуры — по площади. */
    @Override
    public int compareTo(GeometricObject other) {
        if (other instanceof Circle) {
            return Double.compare(this.getRadius(), ((Circle) other).getRadius());
        }
        return Double.compare(this.getArea(), other.getArea());
    }

    /** Наибольший из двух кругов. */
    public static ComparableCircle max(ComparableCircle o1, ComparableCircle o2) {
        return o1.compareTo(o2) >= 0 ? o1 : o2;
    }

    /** Наименьший из двух кругов. */
    public static ComparableCircle min(ComparableCircle o1, ComparableCircle o2) {
        return o1.compareTo(o2) <= 0 ? o1 : o2;
    }
}