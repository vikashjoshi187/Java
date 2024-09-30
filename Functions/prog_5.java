import java.util.Scanner;
public class prog_5 {
    //5) Program to check whether entered character is a $ or @ by its ascii value
     void lower(char ch) {
        if (ch == '$' ) {
            System.out.println("enter characet is $"); 
        } 
        else if(ch=='@'){
            System.out.println("enter characet is @"); 
        }
        else {
            System.out.println("enter characeer is not @ nor $");
        }
    }
    public static void main(String[] args) {
        prog_5 obj = new prog_5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        obj.lower(ch);
    }
}