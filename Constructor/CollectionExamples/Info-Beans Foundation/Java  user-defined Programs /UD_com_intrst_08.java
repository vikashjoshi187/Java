import java.util.Scanner;
import java.lang.Math;

public class UD_com_intrst_08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the time principle amt and rate");
        int t = sc.nextInt();
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float n = 1;

        double a = Math.pow(p * (1 + r / n), (n * t));
        System.out.println("the compound intrest is " + a);

    }
}
