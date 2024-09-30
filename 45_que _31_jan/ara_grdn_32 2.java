import java.util.Scanner;
import java.lang.Math;

public class ara_grdn_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double ps, gs, ag, ap;
        System.out.println("Enter the side of garden");
        gs = sc.nextDouble();
        ag = Math.pow(gs, 2);
        System.out.println("Enter the side of garden");
        ps = sc.nextDouble();
        ap = Math.pow(ps, 2);
        ag = ag - ap;
        System.out.println("The area of garden is " + ag);

    }
}
