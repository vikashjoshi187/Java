import java.util.Scanner;
import java.lang.Math;

public class prog_52 {
    // WAP to find out all the Armstrong numbers between two entered numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter a number 1");
        num1 = sc.nextInt();
        System.out.println("Enter a number 1");
        num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            int dupli = i;
            int sum=0, count = 0;
            // count number of digits ///doubt
            while (dupli > 0) {
                count++;
                dupli = dupli / 10;
            }
            dupli = i;

            while (dupli > 0) {
                int rem = dupli % 10;
                sum = sum + (int) Math.pow(rem,count);

                dupli = dupli / 10;
            }
            if (sum == i) {
                System.out.println(i + " arm");

            }
            
        }

    }
}
