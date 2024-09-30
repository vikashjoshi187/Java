
import java.util.Scanner;

public class UD_avg_5_01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//scanner class defination
        System.out.println("Enter five numbers: "); 
        int f;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        f = (a + b + c + d + e) / 5;

        System.out.println("the avg is " + f);

    }

}