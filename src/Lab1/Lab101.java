package Lab1;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Product Name    : ");
        String productName = input.nextLine();

        System.out.print("Input Product Unit    : ");
        int productUnit = input.nextInt();

        System.out.print("Input Price per Unit  : ");
        double unitPrice = input.nextDouble();

        System.out.println("------------------------------");
        float totalPrice = (float) unitPrice * productUnit;
        System.out.printf("Total Price is %,.2f baht.%n", totalPrice);
        System.out.println("------------------------------");
        System.out.print("How many discount (%) : ");
        int discountPercent = input.nextInt();
        System.out.println("------------------------------");
        float discountBaht = totalPrice * discountPercent/100;
        System.out.printf("Discount from %S %%\t %,.2f baht.%n", discountPercent, discountBaht);
        float finalPrice = totalPrice - discountBaht;
        System.out.printf("Amount to be paid \t %,.2f baht.%n", finalPrice);

        input.close();
    }
}
