import java.util.Scanner;

public class notes_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt, thn, fhn, hn, ffn, tn, tr, fc, twc, orc;
        System.out.println("Enter the amount");
        amt = sc.nextInt();
        thn = amt / 1000;
        System.out.println("the number of thousand note in the amount is " + thn);
        amt = amt % 1000;
        fhn = amt / 500;
        System.out.println("the number of five note in the amount is " + fhn);
        amt = amt % 500;
        hn = amt / 100;
        System.out.println("the number of one hundred note in the amount is " + hn);
        amt = amt % 100;
        ffn = amt / 50;
        System.out.println("the number of one fifty note in the amount is " + ffn);
        amt = amt % 50;
        tn = amt / 20;
        System.out.println("the number of one twenty note in the amount is " + tn);
        amt = amt % 20;
        tr = amt / 10;
        System.out.println("the number of one ten note in the amount is " + tr);
        amt = amt % 10;
        fc = amt / 5;
        System.out.println("the number of five rupee coin in the amount is " + fc);
        amt = amt % 5;
        twc = amt / 2;
        System.out.println("the number of two rupee coin in the amount is " + twc);
        amt = amt % 2;
        orc = amt / 1;
        System.out.println("the number of two rupee coin in the amount is " + orc);

    }
}
