import java.util.Scanner;

public class prog_56 {
    // WAP to print factorial of all the numbers between two entered numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
          long f = 1;
        System.out.println("Enter number 1 ");
        num1 = sc.nextInt();
        System.out.println("Enter number 2 ");
        num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= i; j++) {
                f = f * j;
            }
            System.out.println("factorial of "+i+" is "+f);
            f=1;
        }

    }
}
