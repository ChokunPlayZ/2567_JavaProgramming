package Lab2;

import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input value of X : ");
        int x = scanner.nextInt();
        System.out.print("Input value of Y : ");
        int y = scanner.nextInt();
        while (x > y) {
            System.out.print("Input value of Y, again : ");
            y = scanner.nextInt();
        }

        System.out.println("\n");
        int lastint = x;
        for (int i = x; i < y; i++) {
            System.out.println((lastint) + " + " + (i + 1) + " = " + (lastint + (i + 1)));
            lastint = (lastint + (i + 1));
        }

        scanner.close();
    }
}
