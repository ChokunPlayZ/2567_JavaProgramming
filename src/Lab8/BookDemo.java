package Lab8;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Input author name  : ");
        String authorName = scn.nextLine();

        System.out.print("Input author email : ");
        Author author = new Author(authorName, scn.nextLine());

        System.out.println();

        System.out.print("Input book title   : ");
        Book book = new Book(scn.nextLine(), author);

        System.out.print("Input book page    : ");
        book.setPage(scn.nextInt());

        System.out.println();

        System.out.println(book);
    }
}
