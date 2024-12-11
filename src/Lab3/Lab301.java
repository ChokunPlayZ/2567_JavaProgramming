package Lab3;

import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        String strings = "";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Word: ");
            String word = scanner.next();
            if (word.equalsIgnoreCase("stop")) {
                break;
            }

            strings += word.toUpperCase() + " ";
        }
        System.out.println(strings);
        scanner.close();
    }
}
