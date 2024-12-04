package Lab2;

import javax.swing.*;
import java.util.Random;

public class Withdrawal {
    public static void main(String[] args) {
        Random rand = new Random();

        int balance = rand.nextInt(9) * 100000;

        int amountToWithdraw = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Your balance : " + balance + "\n" +
                        "Input amount to withdraw : "
        ));

        if (amountToWithdraw > balance) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: Cannot withdraw more than balance",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }

        if (amountToWithdraw > 20000) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: Cannot withdraw more than 20,000 baht.",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        int thousand = amountToWithdraw / 1000;
        int fiveHundred = (amountToWithdraw % 1000) / 500;
        int hundred = ((amountToWithdraw % 1000) % 500) / 100;
        int leftover = ((amountToWithdraw % 1000) % 500) % 100;

        if (leftover > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: Cannot withdraw " + leftover + " baht.",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }

        JOptionPane.showMessageDialog(
                null,
                "You withdraw " + amountToWithdraw + " baht.\n" +
                        "1000 = " + thousand + "\n" +
                        "500 = " + fiveHundred + "\n" +
                        "100 = " + hundred
        );

        System.exit(0);
    }
}
