package Lab4;

import java.util.Scanner;

public class Lab403 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input your name, seperated bt space. : ");
        System.out.print(": ");
        String fullname = scn.nextLine();

        System.out.println(abbreviateName(fullname));

        scn.close();
    }

    private static String abbreviateName(String fullname) {
        String initialLetter = "";

        for (int i = 0; i < fullname.length(); i++) {
            if (fullname.charAt(i) == ' ') {
                initialLetter += (""+fullname.charAt(i + 1)).toUpperCase() + ".";
            }
        }
        initialLetter += fullname.substring(0, fullname.indexOf(" "));

        return initialLetter;
    }
}
