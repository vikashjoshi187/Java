import java.util.Scanner;

public class how_mb_26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float lb, bb, lp, bp, ap, ab, tb;
        System.out.println("Enter the lenght of brick");
        lb = sc.nextFloat();
        System.out.println("Enter the breath of brick");
        bb = sc.nextFloat();
        ab = lb * bb;

        System.out.println("Enter the lenght of path");
        lp = sc.nextFloat();
        System.out.println("Enter the breath of path");
        bp = sc.nextFloat();
        ap = lp * bp;

        tb = (ap / ab)*100;

        System.out.println("The total bricks required will be " + tb);

    }
}
