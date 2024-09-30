import java.util.Scanner;

public class tc_b_23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float cs, bl, bw, bh, ac, ab, tc;
        System.out.println("Enter the the side od cube");
        cs = sc.nextFloat();
        ac = cs * cs * cs;
        System.out.println("enter the lenght of box");
        bl = sc.nextFloat();
        System.out.println("enter the width of box");
        bw = sc.nextFloat();
        System.out.println("enter the height of box ");
        bh = sc.nextFloat();
        ab = bl * bw * bh;
        tc = ab / ac;
        System.out.println("The total no of cube requred will be " + tc);

    }
}
