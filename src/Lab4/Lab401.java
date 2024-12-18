package Lab4;

import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog(null, "Input your e-mail:").toLowerCase();

        while (!checkEmail(email)) {
            email = JOptionPane.showInputDialog(null, "Input your e-mail, again:");
        }

        JOptionPane.showMessageDialog(null, "Your e-mail is " + email);
    }

    private static boolean checkEmail(String email) {
        String domain = email.substring(email.indexOf("@") + 1);

        // check valid email address
        if (email.indexOf("@") <= 1 || email.contains(" ")) return false;

        // whitelist email service
        if (domain.equalsIgnoreCase("hotmail.com")) return true;
        if (domain.equalsIgnoreCase("gmail.com")) return true;

        // nothing , retrun false by default!
        return false;
    }
}
