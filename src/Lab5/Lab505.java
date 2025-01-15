package Lab5;

import java.util.Scanner;

public class Lab505 {
    public static void main(String args[]) {
        int[] nums = {78, 36, 58, 41, 25, 92, 75};
        int index = 0;

        Scanner scn = new Scanner(System.in);
        System.out.print("Input index of array : ");
        index = scn.nextInt();
        while (!((index >= 0) && (index < (nums.length)))) {
            System.out.print("Input index of array, again : ");
            index = scn.nextInt();
        }

        System.out.println();

        System.out.println("Value in current index is " + nums[index]);
        if ((index + 1) < nums.length) {
            System.out.println("Value in next   index is " + nums[index + 1]);
        } else {
            System.out.println("Sorry, " + (nums.length - 1) + " is the last index in array.");
        }
    }
}
