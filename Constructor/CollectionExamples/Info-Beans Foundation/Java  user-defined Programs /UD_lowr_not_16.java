import java.util.Scanner;
public class UD_lowr_not_16 {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a character");
        char a =sc.next().charAt(0);
        String s = (a >= 97 && a <= 122) ? a + " is lower case" : a + " is not lower case";
        System.out.println(s);
    }

}
