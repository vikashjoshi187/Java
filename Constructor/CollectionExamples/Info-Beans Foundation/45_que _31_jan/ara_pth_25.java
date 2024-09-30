import java.util.Scanner;

public class ara_pth_25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float lb, bb, nb, ap, ab;
        System.out.println("Enter the number  of brick");
        nb = sc.nextFloat();
        System.out.println("Enter the lenght of brick");
        lb = sc.nextFloat();
        System.out.println("Enter the breath of brick");
        bb = sc.nextFloat();
       
        ab = lb * bb;
        ap = ab * nb;
        System.out.println("The area of path is " + ap);

    }
}
