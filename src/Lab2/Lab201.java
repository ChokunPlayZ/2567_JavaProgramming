package Lab2;

import javax.swing.*;

public class Lab201 {
    public static void main(String[] args) {
        final int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog(null, "How many customer per bill?"));

        float price = numberOfCustomer * 299;
        float discount = (price*10/100);

        int hasDiscount = 2;
        while (hasDiscount == 2) {
            hasDiscount = JOptionPane.showConfirmDialog(null,
                    "Total Price is " + String.format("%,.2f", price) + " baht." + "\n" +
                            "Do you have a member card?"
            );
        }

        float finalPrice = price;
        if (hasDiscount == 0) finalPrice -= discount;

        JOptionPane.showMessageDialog(null,
                "Amount to be paid is "+ String.format("%,.2f", finalPrice) + " baht."
        );
    }
}
