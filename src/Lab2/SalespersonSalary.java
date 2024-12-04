package Lab2;

import java.util.Scanner;

public class SalespersonSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary;

        double input = 0;
        while (input != -1) {
            System.out.print("Enter sales in dollars (or -1 to end): ");
            input = scanner.nextDouble();
            if (input == -1) break;
            salary = 1000 + (input * 15/100);
            System.out.println("Salary is: $" + salary + "\n");
        }

        System.out.println("bye");

        scanner.close();
    }
}
