import java.util.Scanner;

public class prog_57 {
    // WAP to print all the prime numbers between two entered numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, count = 1;
        System.out.println("Enter a number 1");
        num1 = sc.nextInt();
        System.out.println("Enter a number 2");
        num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            int j;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }

            if (j > i / 2 && i > 1) {
                System.out.println(i + " is prime");

            }
            count = 1;

        }

    }
}
