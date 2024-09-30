import java.util.Scanner;

public class prog_1 {
    // 1) Program to check whether entered character is in uppercase or not
    void upper(char ch) {
        if (ch >= 65 && ch <= 90) {
            System.out.println("enter characet is upper case");
        } else {
            System.out.println("enter characet is not upper case");
        }
    }
    public static void main(String[] args) {
        prog_1 obj = new prog_1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        obj.upper(ch);
    }
}