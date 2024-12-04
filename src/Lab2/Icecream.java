package Lab2;

import javax.swing.*;

public class Icecream {
    public static void main(String[] args) {
        final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;

        int flavor = 0;

        flavor = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "[1] Vanilla Flavor 10 B." + "\n" +
                        "[2] Chocolate Flavor 15 B." + "\n" +
                        "Press number to choose flavor:"
        ));

        while (flavor < 1 || flavor > 2) {
            JOptionPane.showMessageDialog(
                    null,
                    "ERROR: Wrong choice!" + "\n" +
                            "Try again...",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );

            flavor = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "[1] Vanilla Flavor 10 B." + "\n" +
                    "[2] Chocolate Flavor 15 B." + "\n" +
                    "Press number to choose flavor:"
            ));
        }

        int topping = JOptionPane.showConfirmDialog(
                null,
                "Do you want topping?"
        );

        int price = flavor == 1 ? VANILLA : CHOCOLATE;
        price += topping == 0 ? TOPPING : 0;

        JOptionPane.showMessageDialog(
                null,
                "You choose " + (flavor == 1 ? "Vanilla" : "Chocolate") + " flavor." + "\n" +
                        "And " + (topping == 0 ? "with" : "no") + " topping" + "\n" +
                        "Total price = " + price + " baht."
        );
    }
}
