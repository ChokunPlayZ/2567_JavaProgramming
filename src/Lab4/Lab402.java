package Lab4;

import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));

        while (!checkValidYear(year)) {
            year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year, again:"));
        }

        if (checkLeapYear(year)) {
            JOptionPane.showMessageDialog(null, year + " is a leap year.");
        } else {
            JOptionPane.showMessageDialog(null, year + " is NOT a leap year.");
        }
    }

    private static boolean checkLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static boolean checkValidYear(int year) {
        return year >= 1000 && year <= 3000;
    }
}
