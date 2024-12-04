package Lab2;

import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number : ");
        int num = scanner.nextInt();
        // ensure that last num always is less than num
        int lastNum = num - 1;
        while (num > lastNum) {
            lastNum = num;
            System.out.print("Input number : ");
            num = scanner.nextInt();
        }
        // BYE BYE
        System.out.println("\nBYE BYE");

        scanner.close();
    }
}
