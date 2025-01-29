package Lab8;

import java.util.Scanner;

public class CheckStockProduct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("How many product list in stock : ");
        Product[] products = new Product[scn.nextInt()];

        System.out.println();

        
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            
            scn.nextLine();
            System.out.print("Input product Id    : ");
            products[i].setId(scn.nextLine());
            
            System.out.print("Input product Unit  : ");
            products[i].setUnit(scn.nextInt());
            
            System.out.println();
        }

        line(40);
        System.out.println("List of product in 'LOW' status.");
        line(40);
        for (Product pd:products) {
            if (pd.getUnit() < 5) System.out.println(">> " + pd.getId() + " has " + pd.getUnit() + " units");
        }

        line(40);
        System.out.println("List of product in 'NORMAL' status.");
        line(40);
        for (Product pd:products) {
            if (pd.getUnit() > 5 && pd.getUnit() <= 50) System.out.println(">> " + pd.getId() + " has " + pd.getUnit() + " units");
        }

        line(40);
        System.out.println("List of product in 'HIGH' status.");
        line(40);
        for (Product pd:products) {
            if (pd.getUnit() > 50) System.out.println(">> " + pd.getId() + " has " + pd.getUnit() + " units");
        }

        scn.close();
    }
    
    public static void line(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
