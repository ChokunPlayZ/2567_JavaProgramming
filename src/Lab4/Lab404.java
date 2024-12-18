package Lab4;

import javax.security.auth.Subject;
import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        inputStudent();
    }

    public static void inputStudent() {
        Scanner scn = new Scanner(System.in);

        String studentId = "";
        while (!isLength(studentId, 10)) {
            System.out.print("Input student's ID : ");
            studentId = scn.nextLine();
        }

        String subjectId = "";
        while (!isLength(subjectId, 7)) {
            System.out.print("Input subject's ID : ");
            subjectId = scn.nextLine();
        }

        displayData(isITStudent(studentId), isITSubject(subjectId), studentId, subjectId);

        scn.close();
    }

    private static boolean isLength(String id, int length) {
        if (id.length() == length) return true;
        return false;
    }

    private static boolean isITStudent(String id) {
        if (id.charAt(2) == '1' && id.substring(3, 6).equals("311")) return true;
        return false;
    }

    private static boolean isITSubject(String id) {
        if (id.startsWith("21") && id.charAt(4) == '1' ) return true;
        return false;
    }

    private static void displayData(boolean student, boolean subject, String studentId, String subjectId) {
        System.out.println();

        System.out.print("Student id: " + studentId + " ");
        if (!student) System.out.print("is not ");
        System.out.println("1st year student in IT");

        if (!subject) System.out.print("not ");
        System.out.println("enroll in courses for Year 1");
    }
}
