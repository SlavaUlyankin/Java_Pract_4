import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public Date getDateCreated() { return dateCreated; }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "создана: " + dateCreated + ", цвет: " + color
                + ", заполнена: " + filled;
    }


    @Override
    public int compareTo(GeometricObject other) {
        return Double.compare(this.getArea(), other.getArea());
    }


    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) >= 0 ? o1 : o2;
    }
}