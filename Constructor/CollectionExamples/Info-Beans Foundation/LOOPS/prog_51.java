import java.util.Scanner;
public class prog_51 {
    //WAP to reverse all the numbers between two entered numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, rev = 0,temp;
        System.out.println("Enter a number");
        num1 = sc.nextInt();
        System.out.println("Enter a number");
        num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            temp=i;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp = temp / 10;
            }
            System.out.println("-"+rev+"  ");
            rev = 0;
            temp=0;

        }

    }
}
