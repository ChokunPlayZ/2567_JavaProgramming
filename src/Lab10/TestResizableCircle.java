package Lab10;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle rc1 = new ResizableCircle(5.0);

        System.out.println(rc1);
        System.out.printf("Perimeter: %s \n", rc1.getPerimeter());
        System.out.printf("Area: %s \n", rc1.getArea());
        line();
        rc1.resize(50);
        System.out.printf("After resize(50%%): %s \n", rc1);
        System.out.printf("Perimeter: %s \n", rc1.getPerimeter());
        System.out.printf("Area: %s \n", rc1.getArea());
    }

    public static void line() {
        for (int i = 1; i<50;i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
