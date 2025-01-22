package Lab7;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f,3.4f);
        System.out.println(r1.toString());

        Spacing();

        r1.setLength(1.0f);
        r1.setWidth(1.0f);
        System.out.println(r1.toString());

        Spacing();

        Rectangle r2 = new Rectangle(5.6f,7.8f);
        System.out.println(r2.toString());
        System.out.println("length is: " + r2.getLength());
        System.out.println("width is: " + r2.getWidth());
        System.out.println("area is: " + String.format("%.2f", r2.getArea()));
        System.out.println("perimeter is: " + String.format("%.2f", r2.getPerimeter()));
    }

    public static void Spacing() {
        System.out.println();
    }
}
