import java.util.Scanner;
//WAP to find out all the perfect numbers between two entered numbers
public class prog_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum = 0;
        System.out.println("Enter  number 1");
        num1 = sc.nextInt();
        System.out.println("Enter  number 2");
        num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.println(i + " is a perfect nmuber");
            }
            sum = 0;

        }

    }
}
