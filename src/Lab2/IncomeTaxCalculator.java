package Lab2;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40k = 0.2;
        final double TAX_RATE_ABOVE_60k = 0.3;

        int taxableIncome;
        double taxPayable;

        System.out.print("Enter the taxable income: $");
        taxableIncome = scanner.nextInt();
        scanner.close();

        if (taxableIncome <= 20000) {
            taxPayable = 0;
        } else if (taxableIncome <= 40000) {
            taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
        } else if (taxableIncome <= 60000) {
            taxPayable = (20000 * TAX_RATE_ABOVE_20K) + ((taxableIncome - 40000) * TAX_RATE_ABOVE_40k);
        } else {
            taxPayable = (20000 * TAX_RATE_ABOVE_20K) + (20000 * TAX_RATE_ABOVE_40k) + ((taxableIncome - 60000) * TAX_RATE_ABOVE_60k);
        }

        System.out.println("Tax Payable is: $" + String.format("%.2f", taxPayable));
    }
}
