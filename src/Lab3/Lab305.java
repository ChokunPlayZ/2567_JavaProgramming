package Lab3;

import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input some sentence : ");
        String sentence = scanner.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point : ");
            sentence = scanner.nextLine();
        }

        System.out.println();
        scanner.close();

        String[] splitted = sentence.split(" ");

        for (int i = 0; i < splitted.length; i++) {
            System.out.println(splitted[i]);
        }
    }
}
