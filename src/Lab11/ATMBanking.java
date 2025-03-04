package Lab11;

import java.util.Scanner;

public class ATMBanking {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter account number : ");
        String accountNumber = scn.next();

        String[] acn = accountNumber.split("-");
        boolean isACNValid = false;

        while (!isACNValid) {
            if (acn.length == 5 &&
                acn[0].length() == 1 && acn[1].length() == 3 && acn[2].length() == 3 && acn[3].length() == 2 && acn[4].length() == 1
            ) {
                try {
                    for (int i = 0; i < acn.length; i++) {
                        Integer.parseInt(acn[i]);
                    }
                    isACNValid = true;
                } catch (NumberFormatException e) {
                    System.out.print("Input wrong type, Enter account number : ");
                    accountNumber = scn.next();
                    acn = accountNumber.split("-");
                }
            } else {
                System.out.print("Input wrong type, Enter account number : ");
                accountNumber = scn.next();
                acn = accountNumber.split("-");
            }
        }

        System.out.print("Enter password : ");
        String password = scn.next();
        while (password.length() != 4) {
            System.out.print("Enter password : ");
            password = scn.next();
        }

    }
}
