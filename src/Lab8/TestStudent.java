package Lab8;


import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("How many students in classroom : ");
        int numberOfStudent = scn.nextInt();

        Student[] students = new Student[numberOfStudent];
        System.out.println();

        for (int i = 0; i < numberOfStudent; i++) {
            students[i] = new Student();
            System.out.println("INPUT INFORMATION OF STUDENT " + (i+1));
            System.out.println("------------------------------");
            scn.nextLine();
            System.out.print("Input student name  : ");
            students[i].setName(scn.nextLine());
            System.out.print("Input student score : ");
            students[i].setScore(scn.nextInt());
            while (!students[i].checkScore()) {
                System.out.print("Input score, again  : ");
                students[i].setScore(scn.nextInt());
            }
            System.out.println();
        }

        System.out.println("LIST OF PASS STUDENT (>= 50):");
        System.out.println("------------------------------");
        for (Student std:students) {
            if (std.isPass()) {
                System.out.println(">> " + std.getName() + " (" + std.getScore() + ") get grade " + findGrade(std.getScore()));
            }
        }

        scn.close();
    }

    public static String findGrade(int score) {
        if (score >= 80) return "A";
        if (score >= 75) return "B+";
        if (score >= 70) return "B";
        if (score >= 65) return "C+";
        if (score >= 60) return "C";
        if (score >= 55) return "D+";
        if (score >= 50) return "D";
        return "F";
    }
}
