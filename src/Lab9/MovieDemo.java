package Lab9;

import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Input movie id           : ");
        String mId = scn.nextLine();
        System.out.print("Input movie name         : ");
        String mName = scn.nextLine();

        System.out.println();

        System.out.print("Input director name      : ");
        String dName = scn.nextLine();
        System.out.print("Input director email     : ");
        String dEmail = scn.nextLine();
        System.out.print("Input director gender    : ");

        char dGender = Character.toLowerCase(scn.nextLine().charAt(0));
        while(!((dGender == 'm') || (dGender == 'f'))) {
            System.out.print("Input director gender, again : ");
            dGender = Character.toLowerCase(scn.nextLine().charAt(0));
        }
        Director director = new Director(dName, dEmail, dGender);

        System.out.println();

        System.out.print("Input movie theater no. : ");
        int tNo = scn.nextInt();
        while (!((tNo >= 1) && (tNo <= 15))) {
            System.out.print("Please input 1 - 15 only : ");
            tNo = scn.nextInt();
        }

        Theater theater = new Theater(mId, mName, director, tNo);

        System.out.println();
        System.out.println(theater);

        scn.close();
    }
}
