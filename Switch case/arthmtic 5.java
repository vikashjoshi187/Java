import java.util.Scanner;
public class arthmtic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  mnth,a,b;
        System.out.println("ENTER NUMBER1");
        a=sc.nextInt();
        System.out.println("ENTER NUMBER2");
        b=sc.nextInt();
        System.out.println("Enter \n1 FOR ADDITION\n2 FOR SUBTRACTION\n3 FOR DIVISION\n4 FOR MULTIPLICATION\n5 FOR MODULOUS");
        mnth = sc.nextInt();
        switch (mnth) {
            case 1:
                System.out.println("THE RESULT OF ADDITION ON A AND B IS "+(a+b));
                break;
            case 2:
                System.out.println("THE RESULT OF SUBTRACTION ON A AND B IS "+(a-b));
                break;
            case 3:
                System.out.println("THE RESULT OF DIVISION ON A AND B IS "+(a/b));
                break;
            case 4:
                System.out.println("THE RESULT OF MULTIPLICATION ON A AND B IS "+(a*b));
                break;
            case 5:
                System.out.println("THE RESULT OF MODULUS ON A AND B IS "+(a%b));
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }

    }
}
