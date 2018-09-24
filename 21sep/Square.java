package Shapes;

public class Square {
    private final double size;

    public Square(double size) {
        this.size = size;
    }

    public double area() {
        return size * size;
    }
}
