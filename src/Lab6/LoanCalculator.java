package Lab6;

public class LoanCalculator {
    String productName;
    double price;
    double interestRate;
    int years;

    public void setLoanDetails(String productName, double price, double interestRate, int years) {
        this.productName = productName;
        this.price = price;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = (interestRate / 100) / 12;
        return (price * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, years * 12)) /
                (Math.pow(1 + monthlyInterestRate, years * 12) - 1);
    }

    public void displayLoanDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Number of Years: " + years + " years");
        System.out.println("Monthly Payment: " + String.format("%.2f", calculateMonthlyPayment()));
    }
}