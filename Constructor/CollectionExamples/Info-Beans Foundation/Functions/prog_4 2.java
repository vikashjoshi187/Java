import java.util.Scanner;

public class prog_4 {
    // 4) Program to check whether entered character is a digit or not

     void lower(char ch) {
        if (ch >= 48 && ch <= 57 ) {
            System.out.println("enter characet is Digit"); 
        } else {
            System.out.println("enter characet is not Digit");
        }
    }
    public static void main(String[] args) {
        prog_4 obj = new prog_4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        obj.lower(ch);
    }
}