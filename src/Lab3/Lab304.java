package Lab3;

import java.util.Scanner;

public class Lab304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Full Name  : ");
        String fullName = scanner.nextLine();

        if (fullName.indexOf(" ") > 0) {
            String firstname = fullName.substring(0, fullName.indexOf(" ")).toUpperCase();
            String lastname = fullName.substring(fullName.indexOf(" ") + 1).toLowerCase();
            System.out.println("First Name : " +  firstname);
            System.out.println("Last Name  : " + lastname);
        } else {
            System.out.println("Incorrect Name.");
        }
    }
}
