package Lab10;

import java.util.Scanner;

public class FictionDemo1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Book Title: ");
        String title = scn.nextLine();

        System.out.print("Book Publish year: ");
        Integer publicYear = scn.nextInt();

        scn.nextLine();
        FictionBook fb = new FictionBook(title, publicYear);

        System.out.print("Author name: ");
        fb.setAuthorName(scn.nextLine());

        System.out.print("Author email: ");
        fb.setEmail(scn.nextLine());
        while (!fb.checkEmail()) {
            System.out.print("Author email, again: ");
            fb.setEmail(scn.nextLine());
        }

        Line();
        System.out.println(fb);
    }

    public static void Line() {
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
