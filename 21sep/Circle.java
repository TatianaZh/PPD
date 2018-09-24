package Shapes;

public class Circle<radius> {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area( ) {
        return Math.PI * this.radius * this.radius;
    }


}


