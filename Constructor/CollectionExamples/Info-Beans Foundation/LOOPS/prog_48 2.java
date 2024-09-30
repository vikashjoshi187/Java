import java.util.Scanner;
public class prog_48 {
    //WAP to find out the factors of all the numbers between two entered numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter a number 1");
        num1 = sc.nextInt();
        System.out.println("Enter a number 2");
        num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println("The factorial of "+i+" is "+j);
                }
            }
            System.out.print("\n\n");
        }

    }
}
