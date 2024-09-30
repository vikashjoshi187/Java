import java.util.Scanner;

public class lwer_uppr_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character  ");
        char a;
        a= sc.next().charAt(0);
        if (a >= 97 && a<=122) {
            System.out.println("upper case will be "+(char)(a-32));
        } 
        else {
            System.out.println("its lower case "+(char)a);
        }

    }

}
