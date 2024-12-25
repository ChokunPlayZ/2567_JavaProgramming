package Lab5;

import javax.swing.*;

public class Lab507 {
    public static void main(String[] args) {
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number "+ (i+1)));
        }

        showEven(nums);
        showOdd(nums);
    }

    public static void showEven(int[] nums) {
        String message = "List of even number:\n";
        for (int num : nums) {
            if ((num % 2) == 0) {
                message += num + " ";
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public static void showOdd(int[] nums) {
        String message = "List of odd number:\n";
        for (int num : nums) {
            if ((num % 2) != 0) {
                message += num + " ";
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
