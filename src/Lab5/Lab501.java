package Lab5;

import javax.swing.*;

public class Lab501 {
    public static void main(String[] args) {
        int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
        double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89,1.26,8.00};

        boolean found = false;
        int query = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter item number to order"));

        for (int i = 0; i < validValues.length;i++) {
            if (validValues[i] == query) {
                System.out.println("Item " + query + " is " + String.format("%,.1f", price[i]));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid item");
        }
    }
}
