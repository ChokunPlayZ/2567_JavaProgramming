package Lab9;

public class Sales extends Employee{
    private double sales;

    Sales(String id, String name, double salary, double sales) {
        super(id, name, salary);
        this.sales = sales;
    }

    Sales(String id, String name, double sales) {
        this(id, name, 0.0, sales);
    }

    public double getCommission() {
        if (this.sales > 50000) return (this.sales - 50000) * ((double)15/100);
        if (this.sales > 10000) return (this.sales - 10000) * ((double)10/100);
        return 0;
    }

    public String toString() {
        return String.format("%s (%s) get comission %,.2f B.", super.getName(), super.getId(), this.getCommission());
    }

}
