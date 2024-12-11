package Lab3;

import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a sentence : ");
        String sentence = scanner.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("Input a sentence, again : ");
            sentence = scanner.nextLine();
        }

        System.out.println();
        scanner.close();

        int spaceBar = sentence.length() - sentence.replaceAll(" ", "").length();
        int words = sentence.split(" ").length;

        System.out.println("This sentence has " + spaceBar + " spacebar.");
        System.out.println("This sentence has " + words + " word.");
    }
}