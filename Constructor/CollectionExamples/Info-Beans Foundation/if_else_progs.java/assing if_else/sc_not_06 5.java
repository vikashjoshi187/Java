import java.util.Scanner;

public class sc_not_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character  ");
        char Sc;
        Sc = sc.next().charAt(0);
        if (Sc == 36) {
            System.out.println("Its is "+(char)Sc);

        } else if (Sc == 64) {
            System.out.println("Its is "+(char)Sc);
        } else {
            System.out.println("Invalid charcter");
        }

    }

}
