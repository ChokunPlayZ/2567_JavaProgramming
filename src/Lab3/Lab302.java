package Lab3;

import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog(null, "Input your e-mail:").toLowerCase();

        while (email.indexOf("@") <= 0 || email.contains(" ")) {
            email = JOptionPane.showInputDialog(null, "Input your e-mail, again:");
        }

        // seperate domain from email
        String domain = email.substring(email.indexOf("@") + 1);

        if (domain.equalsIgnoreCase("hotmail.com") || domain.equalsIgnoreCase("gmail.com")) {
            JOptionPane.showMessageDialog(null, "Your e-mail is " + email);
        } else {
            JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
        }
    }
}
