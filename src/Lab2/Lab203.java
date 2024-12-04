package Lab2;

import javax.swing.*;

public class Lab203 {
    public static void main(String[] args) {
        final double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input your weight"));
        final double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Input your height")) / 100;

        final double BMI = weight / (height * height);

        String bodyClass;
        if (BMI < 18.5) {
            bodyClass = "Under-Weight";
        } else if (BMI < 24.9) {
            bodyClass = "Normal-Weight";
        } else if (BMI < 29.9) {
            bodyClass = "Over-Weight";
        } else {
            bodyClass = "Obesity";
        }

        JOptionPane.showMessageDialog(null,
                "BMI = " + String.format("%,.2f", BMI) + "\n" +
                        "You're " + bodyClass
                , "BMI"
                , JOptionPane.WARNING_MESSAGE);
    }
}
