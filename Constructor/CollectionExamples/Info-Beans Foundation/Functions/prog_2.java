import java.util.Scanner;

public class prog_2 {
    // 2) Program to check whether entered character is in lowercase or not
    void lower(char ch) {
        if (ch >= 97 && ch <= 122) {
            System.out.println("enter characet is Lower  case");
        } else {
            System.out.println("enter characet is not Lower case");
        }
    }
    public static void main(String[] args) {
        prog_2 obj = new prog_2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        obj.lower(ch);
    }
}