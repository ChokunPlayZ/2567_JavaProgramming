package Lab3;

import java.util.Scanner;

public class SecurePasswordChecker {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your password (type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program Terminated");
                break;
            }

            String errors = "";
            if (input.length() < 8) {
                errors += "- Password must be at least 8 characters long.\n";
            }

            boolean hasLowercase = false;
            boolean hasUppercase = false;
            boolean hasDigit = false;

            for (char c : input.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                }
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                }
                if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            if (!hasLowercase) {
                errors += "- Password must contain at least one lowercase letter.\n";
            }

            if (!hasUppercase) {
                errors += "- Password must contain at least one uppercase letter.\n";
            }

            if (!hasDigit) {
                errors += "- Password must contain at least one digit.\n";
            }

            if (errors.isEmpty()) {
                System.out.println("Password is secure.");
                break;
            } else {
                System.out.println("Password is not secure.");
                System.out.println(errors);
            }
        }
        scanner.close();
    }
}
