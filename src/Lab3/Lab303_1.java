package Lab3;

import javax.swing.*;
import java.util.Scanner;

public class Lab303_1 {
    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog(null, "Input a sentence :");

        while (!sentence.endsWith(".")) {
            sentence = JOptionPane.showInputDialog(null, "Input a sentence, again :");
        }

        System.out.println();

        int spaceBar = sentence.length() - sentence.replaceAll(" ", "").length();
        int words = sentence.split(" ").length;

        JOptionPane.showMessageDialog(null,
                "This sentence has " + spaceBar + " spacebar."+ "\n" +
                        "This sentence has " + words + " word.");
    }
}