import java.util.Scanner;

public class sum_five_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fn, sn, tn, fth, sxt, sum;
        System.out.println("Enter a the digit number");
        num = sc.nextInt();
        if (num <= 99999 && num>=10000) {
            fn = num / 10000;
            num = num % 10000;
            sn = num / 1000;
            num = num % 1000;
            tn = num / 100;
            num = num % 100;
            fth = num / 10;
            num = num % 10;
            sxt = num;
            sum = fn + sn + tn + fth + sxt;
            System.out.println("The sum of all numbers int the digit is " + sum);

        }
        else{
            System.out.println("Invalid input");
        }

    }
}