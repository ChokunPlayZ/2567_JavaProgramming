package Lab10;

import javax.swing.*;

public class CoffeeShopDemo {
    public static void main(String[] args) {
        Barista staff1 = new Barista("Leon", 'M');
        Barista staff2 = new Barista("Claire", 'F');

        Barista b = null;

        Integer dType = Integer.parseInt(JOptionPane.showInputDialog(null, "Drink Type"));
        Integer cType = Integer.parseInt(JOptionPane.showInputDialog(null, "Coffee Type"));
        Character cSize = JOptionPane.showInputDialog(null, "Coffee Size").toUpperCase().charAt(0);;
        Integer bNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Barista number"));

        if (bNum == 1) {
            b = staff1;
        } else {
            b = staff2;
        }
        Coffee cof = new Coffee(dType, cSize, cType, b);

        JOptionPane.showMessageDialog(null, cof+"\n"+b);
    }
}
