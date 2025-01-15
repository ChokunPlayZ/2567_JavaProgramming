package Lab5;

import java.util.Scanner;

public class Lab502 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length;i++) {
            System.out.print("Input number " + (i+1) + " : ");
            nums[i] = scn.nextInt();
        }

        System.out.println();
        System.out.println("Summation of positive number is " + sumOfPos(nums));
    }

    public static int sumOfPos(int[] nums) {
        int total = 0;
        for (int _n : nums) {
            if (_n > 0) {
                total += _n;
            }
        }
        return total;
    }
}
