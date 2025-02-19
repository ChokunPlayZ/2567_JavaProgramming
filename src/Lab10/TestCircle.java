package Lab10;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);

        System.out.println(c1);
        System.out.printf("Perimeter: %,.2f \n", c1.getPerimeter());
        System.out.printf("Area: %,.2f \n", c1.getArea());
    }
}
