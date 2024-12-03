package Lab1;

import javax.swing.*;
import java.util.*;
public class JavaExample2 {
    public  static  void main(String[] args) {

        String productName = JOptionPane.showInputDialog(null, "Input Product Name");
        int productUnit = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Product Unit"));
        double unitPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Price Per Unit"));

        float totalPriceOfProduct = (float) (productUnit * unitPrice);
        float totalWithVat = totalPriceOfProduct + (totalPriceOfProduct * 7/100);

        String fmtPriceOfProduct = String.format("%,.2f", totalPriceOfProduct);
        String fmtTotalWithVat = String.format("%,.2f", totalWithVat);

        String message = ("Total Price is " + fmtPriceOfProduct + " baht.")+ "\n" + ("Add VAT 7% is " + fmtTotalWithVat + " baht.");
        JOptionPane.showMessageDialog(null, message);

    }
}
