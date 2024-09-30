
import java.util.Scanner;

public class prog_10 {
    // Program to get marks of 5 subjects from user and find out its grade using
    // nested if else
    int sub1, sub2, sub3, sub4, sub5;

    void setData(int sub1, int sub2, int sub3, int sub4, int sub5) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }

    String Compair() {
        float per = ((sub1 + sub2 + sub3 + sub4 + sub5) / 5);
        System.out.println("Percentage is :" + per);
        if (per >= 75 && per <= 100) {
            // System.out.println("Gread A");
            return "Gread A";

        } else {
            if (per >= 60 && per < 75) {
                // System.out.println("Gread B");
                return "Gread B";

            } else {
                if (per >= 50 && per < 60) {
                    // System.out.println("Gread C");
                    return "Gread C";
                } else {
                    if (per >= 33 && per < 50)
                        return "Gread D";
                    else
                        return "Fail";
                }
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 1st subject");
        int sub1 = sc.nextInt();
        System.out.println("Enter marks of 2nd subject");
        int sub2 = sc.nextInt();
        System.out.println("Enter marks of 3rd subject");
        int sub3 = sc.nextInt();
        System.out.println("Enter marks of 4th subject");
        int sub4 = sc.nextInt();
        System.out.println("Enter marks of 5th subject");
        int sub5 = sc.nextInt();
        prog_10 obj = new prog_10();
        obj.setData(sub1, sub2, sub3, sub4, sub5);
        String s = obj.Compair();
        System.out.println(s);
    }
}
