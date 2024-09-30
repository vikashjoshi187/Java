import java.util.Scanner;

public class prog_3 {
    // 3) Program to check whether entered character is an alphabet or not

     void lower(char ch) {
        if (ch >= 97 && ch <= 122 || ch>=65 && ch<=90) {
            System.out.println("enter characet is Alphabet"); 
        } else {
            System.out.println("enter characet is not Alphabet");
        }
    }
    public static void main(String[] args) {
        prog_3 obj = new prog_3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        obj.lower(ch);
    }
}