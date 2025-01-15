package Lab5;

import java.util.Scanner;

public class Lab503 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] nums = new int[7];

        for (int i = 0; i < nums.length;i++) {
            System.out.print("Input number " + (i+1) + " : ");
            nums[i] = scn.nextInt();
        }

        System.out.println();
        String oddMsg = "";
        int oddCount = 0;
        for (int _n : nums) {
            if ((_n % 2) != 0) {
                oddMsg += _n + " ";
                oddCount++;
            }
        }
        System.out.println("There are "+oddCount+" of odd number.");
        System.out.println("List of odd number : " + oddMsg);

        scn.close();
    }
}
