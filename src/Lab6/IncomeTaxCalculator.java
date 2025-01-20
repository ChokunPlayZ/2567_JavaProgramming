package Lab6;

public class IncomeTaxCalculator {
    double income;

    public void setIncome(double income) {
        this.income = income;
    }
    
    public double calculateTax() {
        if (income <= 150000) {
            return 0;
        } else if (income <= 300000) {
            return (income - 150000) * 0.05;
        } else if (income <= 500000) {
            return (150000 * 0.05) + ((income - 300000) * 0.1);
        } else {
            return (150000 * 0.05) + (200000 * 0.1) + ((income - 500000) * 0.2);
        }
    }

    public void displayTaxDetails() {
        System.out.println("Income: $" + income);
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
    }
}
