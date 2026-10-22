public class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
        super("Стороны не образуют треугольник");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}