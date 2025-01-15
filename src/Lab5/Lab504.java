package Lab5;

import java.util.Scanner;

public class Lab504 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Double[] nums = new Double[5];
        int total = 0;

        for (int i = 0; i < nums.length;i++) {
            System.out.print("Input number " + (i+1) + " : ");
            nums[i] = scn.nextDouble();
            total += nums[i];
        }

        double avg = (double) total / nums.length;
        System.out.println();


        System.out.println("Average of " + nums.length + " is " + avg);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > avg) {
                System.out.println("> Student " + (i+1) + " " + nums[i]);
            }
        }

        scn.close();
    }
}
