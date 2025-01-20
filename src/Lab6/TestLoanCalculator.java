package Lab6;

public class TestLoanCalculator {
    public static void main(String[] args) {
        LoanCalculator loanCalculator = new LoanCalculator();
        loanCalculator.setLoanDetails("Laptop", 50000, 5, 2);
        loanCalculator.displayLoanDetails();
    }
}
