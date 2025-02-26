package Lab11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ATMChecking extends ATMData{
    private int money;

    ATMChecking(String accountNumber, String password, int money) {
        super(accountNumber, password);
        this.money = money;
    }

    public boolean checkBookBank() {
        boolean status = false;
        try (BufferedReader readFile = new BufferedReader(new FileReader("src/Lab11/txtFile/ATMBookBank.txt"))) {
            String temp = "";

            while ((temp = readFile.readLine()) != null) {
                String[] data = temp.split("\t");

                if (data.length < 3) continue;

                String accountNumber = data[0];
                String password = data[1];
                Double money = Double.parseDouble(data[2]);

                if ((accountNumber.equalsIgnoreCase(super.getId())) && (password.equalsIgnoreCase(super.getPassword())) && (money <= this.money)) {
                    status = true;
                    this.money -= money;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return status;
    }

    public void show() {
        int throusands = money / 1000;
        int fivehundreds = money % 1000 / 500;
        int hundreds = money % 1000 % 500 / 100;

        System.out.printf("Withdrawing %,.2f, get\n");
        if (throusands > 0) System.out.printf("\t\t1000 = %,f\n", throusands);
        if (fivehundreds > 0) System.out.printf("\t\t500 = %,f\n", fivehundreds);
        if (hundreds > 0) System.out.printf("\t\t100 = %,f\n", hundreds);
        System.out.printf("Your balance is %,.2f\n", money);
    }
}
