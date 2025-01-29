package Lab8;

import java.util.Scanner;

public class StockProduct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Product[] products = new Product[4];

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();

            System.out.print("Input product Id    : ");
            products[i].setId(scn.nextLine());

            System.out.print("Input product Unit  : ");
            products[i].setUnit(scn.nextInt());

            System.out.print("Input product Price : ");
            products[i].setPrice(scn.nextDouble());

            System.out.println();
            scn.nextLine();
        }

        System.out.println("----------------------------------------");
        double totalPrice = 0;
        for (Product pd:products) {
            System.out.println("Product ID : " + pd.getId() + ", Total price = " + String.format("%,.2f", pd.calculate()) + " baht.");
            totalPrice += pd.calculate();
        }
        System.out.println("----------------------------------------");
        System.out.println("Total price of all products = " + String.format("%,.2f", totalPrice));

        scn.close();

    }
}
