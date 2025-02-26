package Lab11;

import java.io.*;
import java.util.Scanner;

public class Lab1101 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Section: ");
        int section = input.nextInt();

        printHeader(section);
        displayStudentList(section);
    }

    public static void printHeader(int section) {
        System.out.println("**************************************");
        System.out.println("\tlist of Data for Section " + section);
        System.out.println("**************************************");
    }

    public static void displayStudentList(int section) {
        try (BufferedReader readFile = new BufferedReader(new FileReader("src/Lab11/txtFile/List107.txt"))) {
            String temp = "";

            while ((temp = readFile.readLine()) != null) {
                String[] data = temp.split("\t");

                if (data.length < 6) continue;

                int studentSection = Integer.parseInt(data[3]);
                double midterm = Double.parseDouble(data[4]);
                double finalscore = Double.parseDouble(data[5]);

                if (studentSection == section) {
                    System.out.printf("%-10s %-25s\t%.2f\t%.2f %s\n", data[0], data[2], midterm, finalscore, determineResult(midterm, finalscore));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public static String determineResult(double midterm, double finalscore) {
        return (midterm+finalscore) <= 40 ? "Fail":"Pass";
    }
}
