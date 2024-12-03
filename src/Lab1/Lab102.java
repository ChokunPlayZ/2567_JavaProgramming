package Lab1;

import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        int minutes = input.nextInt();

        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        input.close();
    }
}
