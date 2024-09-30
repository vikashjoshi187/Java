import java.util.Scanner;

public class sum_f_l_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fn, sxt, sum;
        System.out.println("Enter a the digit number");
        num = sc.nextInt();
        if (num <= 999999 && num>=100000) {
            fn = num / 100000;
            num = num % 10;
            sxt = num%10;
            sum = fn  + sxt;
            System.out.println("The sum of first and last digit is " + sum);

        }else{
            System.out.println("Invalid input");
        }

    }
}