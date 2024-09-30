import java.util.Scanner;
import java.lang.Math;

public class wood_ars_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b1, b2, h, at, ra, aw, bw;
        System.out.println("enter the base 1");
        b1 = sc.nextFloat();
         System.out.println("enter the base 1");
        b2=sc.nextFloat();
        System.out.println("enter the height");
        h=sc.nextFloat();
        at = ((b1 + b2)*h)/2 ;
        System.out.println(at);
        System.out.println("Enter the breath of path way");
        bw = sc.nextFloat();
        aw = bw * h;
        ra=at-aw;
        System.out.println("the remaining wooded area is "+ra);

    }
}
