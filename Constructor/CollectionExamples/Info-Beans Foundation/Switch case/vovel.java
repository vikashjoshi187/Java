import java.util.Scanner;

public class vovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char mnth;
        System.out.println("Enter a character");
        mnth = sc.next().charAt(0);
        switch (mnth) {
            case 'a':
                System.out.println("IT'S A VOVEL");
                break;
            case 'e':
                System.out.println("IT'S A VOVEL");
                break;
            case 'i':
                System.out.println("IT'S A VOVEL");
                break;
            case 'o':
                System.out.println("IT'S A VOVEL");
                break;
            case 'u':
                System.out.println("IT'S A VOVEL");
                break;

                case 'A':
                System.out.println("IT'S A VOVEL");
                break;
            case 'E':
                System.out.println("IT'S A VOVEL");
                break;
            case 'I':
                System.out.println("IT'S A VOVEL");
                break;
            case 'O':
                System.out.println("IT'S A VOVEL");
                break;
            case 'U':
                System.out.println("IT'S A VOVEL");
                break;
            

            default:
                System.out.println(" A NORMAL CHARACTER");
                break;
        }

    }
}
