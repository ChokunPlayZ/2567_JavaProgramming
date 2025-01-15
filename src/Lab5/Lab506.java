package Lab5;

import javax.swing.*;

public class Lab506 {
    public static void main(String args[]) {
        String[] helloword = {"Good Morning", "Good Afternoon", "Good Evening" , "Good Night"};

        String message = "The greeting words in english:\n";

        for (String _w : helloword) {
            message += "- "+_w+"\n";
        }

        JOptionPane.showMessageDialog(null, message);

    }
}
