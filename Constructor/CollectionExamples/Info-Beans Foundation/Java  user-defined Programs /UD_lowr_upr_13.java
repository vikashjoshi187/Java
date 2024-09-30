import java.util.Scanner;

public class UD_lowr_upr_13 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lower case char");
        char a = sc.next().charAt(0);
        System.out.println("the upper case of " + a + " is " + (char) (a - 32));

    }
}
