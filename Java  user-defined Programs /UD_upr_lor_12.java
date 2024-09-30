import java.util.Scanner;

public class UD_upr_lor_12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a upper case character");

        char a = sc.next().charAt(0);
        System.out.println("the lower case of " + a + " is " + (char) (a + 32));

    }
}
