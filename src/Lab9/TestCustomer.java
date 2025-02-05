package Lab9;

public class TestCustomer {
    public static void main(String[] args) {
        System.out.print("###Test Customer Class###");
        Customer c1 = new Customer(1088, "Conan Edogawa", 10);
        System.out.println(c1);
        c1.setDiscount(5);
        System.out.println(c1);
        Line();
        System.out.printf("id is      : %s \n", c1.getId());
        System.out.printf("name is    : %s \n", c1.getName());
        System.out.printf("discount is: %s \n", c1.getDiscount());
        Line();
        System.out.println("###Test Invoice Class###");
        Invoice inv1 = new Invoice(101, c1, 12000.00);
        System.out.println(inv1);
        inv1.setAmount(10000);
        System.out.println(inv1);
        Line();
        System.out.printf("id is       : %s \n", inv1.getID());
        System.out.printf("customer is : %s \n", inv1.getCustomer());
        System.out.printf("amount is   : %s \n", inv1.getAmount());
        Line();
        System.out.printf("customer's id is         : %s \n", inv1.getCustomer().getId());
        System.out.printf("customer's name is       : %s \n", inv1.getCustomer().getName());
        System.out.printf("customers' discount is   : %s \n", inv1.getCustomer().getDiscount());
        System.out.printf("amount after discount is : %.2f \n", inv1.getAmountAfterDiscount());
    }

    public static void Line() {
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
