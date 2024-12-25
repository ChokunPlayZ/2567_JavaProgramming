package Lab5;

import javax.swing.*;

public class Lab508 {
    public static void main(String[] args) {
        int[] nums = {25, 78, 41, 22, 36, 85, 37};

        int index = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array"));
        while (!checkIndex(nums, index)) {
            index = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array, again"));
        }

        String message = "Current data, nums["+index+"] is " + currentData(nums, index) + "\n";
        message += (checkIndex(nums, index - 1) ? "Previous data, nums["+ (index - 1) +"] is " + prevData(nums, index) : "No Previous data") + "\n";
        message += (checkIndex(nums, index + 1) ? "Next data, nums["+ (index + 1) +"] is " + nextData(nums, index) : "No Next data" ) + "\n";

        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean checkIndex(int[] nums, int index) {
        return (index < nums.length) && (index >= 0);
    }

    public static int currentData(int[] nums, int index) {
        return nums[index];
    }

    public static int prevData(int[] nums, int index) {
        return nums[index - 1];
    }

    public static int nextData(int[] nums, int index) {
        return nums[index + 1];
    }
}
