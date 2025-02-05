package Lab9;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Input Employee id     : ");
        String eId = scn.nextLine();
        System.out.print("Input Employee name   : ");
        String eName = scn.nextLine();
        System.out.print("Input Employee salary : ");
        double eSalary = scn.nextDouble();
        System.out.print("Input Employee sales  : ");
        double eSales = scn.nextDouble();

        Sales sales = new Sales(eId, eName, eSalary, eSales);

        System.out.println();
        System.out.println(sales);
        System.out.printf("Total salary %,.2f baht.", sales.getSalary() + sales.getCommission());

        scn.close();
    }
}
