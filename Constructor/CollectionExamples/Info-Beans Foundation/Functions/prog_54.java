import java.util.Scanner;
public class prog_54 {
    // Program to check number is palindrome or not 
    String palnDrm(int num){
        int rev = 0, temp = num;
        String a = "";
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev)
            a = "Number is Palindrome";
        else
            a = "Number is not Palindrome";
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog_54 obj = new prog_54();
        System.out.println("Enter a Number  ");
        int num = sc.nextInt();
        System.out.println("" + obj.palnDrm(num));
    }
}