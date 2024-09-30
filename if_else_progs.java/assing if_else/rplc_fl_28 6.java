
import java.util.Scanner;

public class rplc_fl_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fn,mdlt, sxt, sum;
        System.out.println("Enter a five digit number");
        num = sc.nextInt();
        if (num <= 99999 && num>=10000) {
            fn = num / 10000;
            num = num % 10000;
            mdlt=num/10;
            sxt=num%10;
            sxt=sxt*10000;
            mdlt=mdlt*10;
            sum=sxt+mdlt+fn;
            System.out.println("The sum of first and last digit is " + sum);

        }
        else{
            System.out.println("Invalid input");
        }

    }
}
