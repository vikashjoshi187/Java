import java.util.Scanner;
public class prog_self {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a;
       System.out.println("Enter a number");
       a=sc.nextInt();
       switch (a%2) {
        case 0:
            System.out.println("Even number");
            break;
       
        default:
        System.out.println("Odd number");
            break;
       }

    }
}