import javax.swing.*;

public class MusicWorldApp {
    public static void main(String[] args) {
        String cdId, cdTitle;
        int cdQuantity;
        double cdPrice, cdSubtotal, cdTotal;

        cdId = JOptionPane.showInputDialog(null, "This program calculates the total cost of a CD order\nPlease Enter the ID of the CD");
        cdTitle = JOptionPane.showInputDialog(null, "Please Enter the title of the CD");
        cdPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price of the CD in U.S. dollars"));
        cdQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the quantity to be purchased"));

        cdSubtotal = cdPrice * cdQuantity;
        cdTotal = cdSubtotal + (cdSubtotal * 6.25/100);

        String message = ("CD ID: " + cdId) + "\n" +
                ("CD Title: " + cdTitle) + "\n" +
                ("CD Unit Price: $" + cdPrice) + "\n" +
                ("CD Quantity: " + cdQuantity) + "\n\n" +
                ("Subtotal: $" + cdSubtotal) + "\n" +
                ("Tax rate: 6.25%") + "\n" +
                ("Total: $" + cdTotal) + "\n\n" +
                "End Of Program";

        JOptionPane.showMessageDialog(null, message);
    }
}
