package Lab5;

import javax.swing.*;

public class Lab501_1 {
    public static void main(String[] args) {
        String[] deptName = {"Accounting", "HR", "Sales","Innovation" };

        boolean found = false;
        String query = JOptionPane.showInputDialog(null, "Enter a department name");

        for (int i = 0; i < deptName.length;i++) {
            if (deptName[i] == query) {
                JOptionPane.showMessageDialog(null, query+"was found in the list");
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null,query+" was not found in the list");
        }
    }
}
