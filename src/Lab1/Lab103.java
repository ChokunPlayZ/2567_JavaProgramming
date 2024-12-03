package Lab1;

import javax.swing.*;

public class Lab103 {
    public static void main(String[] args) {
        int parkTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Time Parking (minute)"));

        int hour = parkTime / 60;
        int minute = (parkTime % 60);

        float amountDue = (hour * 50) + (float) (minute * 0.25);

        String fmtAmt = String.format("%,.2f", amountDue);

        String message = "You parking " + hour + " Hour " + minute + " Minute.\nAmount to be paid is "+ fmtAmt +" Baht";
        JOptionPane.showMessageDialog(null, message);
    }
}
