package Lab3;

import java.util.Scanner;

public class Lab307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Text : ");
        String text = scanner.nextLine().replace(" ", "").toLowerCase();

        // reverse text
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if (text.equals(reversed)) {
            System.out.println("It is palindrome.");
        } else {
            System.out.println("It is not palindrome.");
        }

        scanner.close();
    }
}
