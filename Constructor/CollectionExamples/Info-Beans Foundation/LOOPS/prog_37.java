import java.util.Scanner;
public class prog_37 {
    // WAP to check whether entered number is palindrome or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tem = 0, temp1, num2;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        num2 = num;
        while (num2 > 0) {
            temp1 = num % 10;
            tem = (tem * 10) + temp1;
            num2 = num2 / 10;
        }
        if (num == tem) {
            System.out.println("it is a palindrome number");

        } else {
            System.out.println("not a palindrome");
        }
    }
}
