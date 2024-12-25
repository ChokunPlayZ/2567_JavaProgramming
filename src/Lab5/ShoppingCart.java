package Lab5;

import javax.swing.*;

public class ShoppingCart {
    public static void main(String[] args) {
        displayCartAndTotal("Apple", 10.5, "Banana", 5.75, "Orange", 7.3);
        displayCartAndTotal("Milk", 20.0, "Bread", 15.0);
        displayCartAndTotal();
    }

    public static void displayCartAndTotal(Object... items) {
        double totalPrice = 0.0;
        String message = "";

        if (items.length == 0) {
            // System.out.println("No items in the cart.");
            JOptionPane.showMessageDialog(null, "No items in the cart.");
            return;
        }
        //  System.out.println("Items in the cart:");
        message += "Items in the cart";

        for (int i = 0; i < items.length; i+=2) {
//            System.out.println("- " + items[i] + ": " + items[i+1] );
            message += "- " + items[i] + ": " + items[i+1] + "\n";
            totalPrice += (double) items[i+1];
        }

//        System.out.println("Total Price: $"+ String.format("%,.2f", totalPrice));
        message += "Total Price: $"+ String.format("%,.2f", totalPrice);
        JOptionPane.showMessageDialog(null, message);
        System.out.println();

    }
}
