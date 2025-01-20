package Lab6;

import java.util.Scanner;

public class TestProductInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Product p1 = new Product();

        System.out.print("Enter product name: ");
        String name = scn.nextLine();

        System.out.print("Enter product price: ");
        double price = scn.nextDouble();

        System.out.print("Enter VAT rate (%): ");
        double vat = scn.nextDouble();

        scn.close();

        System.out.println("\nProduct Details:");
        p1.setProductDetails(name, price, vat);
        p1.displayProductDetails();
    }
}
