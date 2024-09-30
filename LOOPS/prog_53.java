import java.util.Scanner;

public class prog_53 {
    // WAP to print all the strong numbers between two entered numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, dupli, rem, sum = 0;
        System.out.println("Enter a number 1");
        num1 = sc.nextInt();
        System.out.println("Enter a number 2");
        num2 = sc.nextInt();

        for (int j = num1; j <= num2; j++) {

            dupli = j;
           
           
            while (dupli > 0) 
            {
                rem = dupli % 10;
                int f = 1;
                for (int i = 1; i <= rem; i++) {
                    f = f * i;
                }
                sum = sum + f;
                dupli = dupli / 10;
            }

            
            
            if (sum == j) {
                System.out.println(j + " is Strong number");
            }
            rem=0;
            sum=0;

        }
    }
}
