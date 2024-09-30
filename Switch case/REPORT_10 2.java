import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;

public class REPORT_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sname, fname, mname, add, g=null;
        int roll, s1, s2, s3, s4, s5, p;

        System.out.println("ENTER STUDENT NAME");
        sname = sc.next();
        sc.nextLine();
        System.out.println("ENTER ROLL NO");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("ENTER FATHER NAME");
        fname = sc.next();
        sc.nextLine();
        System.out.println("ENTER MOTHER NAME");
        mname = sc.next();
        sc.nextLine();
        System.out.println("ENTER ADDRESS");
        add = sc.next();
        sc.nextLine();
        System.out.println("ENTER MARKS OF SUBJECT 1");
        s1 = sc.nextInt();

        System.out.println("ENTER MARKS OF SUBJECT 2");
        s2 = sc.nextInt();

        System.out.println("ENTER MARKS OF SUBJECT 3");
        s3 = sc.nextInt();

        System.out.println("ENTER MARKS OF SUBJECT 4");
        s4 = sc.nextInt();

        System.out.println("ENTER MARKS OF SUBJECT 5");
        s5 = sc.nextInt();
        p = ((s1 + s2 + s3 + s4 + s5) * 100) / 500;

        System.out.println("PPPPPP " + p);
        p = p / 10;

        System.out.println("ppppp " + p);
        switch (p) {
            case 1:
            case 2:
            case 0:

                g = "FAIL";
                break;

            case 4:
            case 5:
            case 3:

                g = "D GRADE";
                break;

            case 7:
            case 6:

                g = "C GRADE";
                break;

            case 8:
            case 9:

                g = "B GRADE";
                break;

            case 10:

                g = "A GRADE";
                break;

        }

        System.out.println("THE STUDENT NAME IS " + sname);
        System.out.println("THE MOTHER  NAME IS " + mname);
        System.out.println("THE FATHER NAME IS " + fname);
        System.out.println("THE STUDENT'S ROLL NO IS " + roll);
        System.out.println("THE STUDENTS ADDRESS IS " + add);
        System.out.println("THE STUDENT'S CGPA IS " + p);
        System.out.println("THE STUDENT'S GRADE IS " + g);

    }
}