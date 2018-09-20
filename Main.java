package Shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle();
        Square shape2 = new Square();
        Circle shape3 = new Circle();

        shape1.area = shape1.Area(1,2);
        System.out.println(shape1.area);

        shape2.area = shape2.Area(1);
        System.out.println(shape2.area);

        shape3.area = shape3.Area(1);
        System.out.println(shape3.area);



    }

}
