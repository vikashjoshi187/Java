import java.util.Scanner;
public class UD_arth_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        c = a + b;
        System.out.println("The additon od a and is " + c);
        c = a - b;
        System.out.println("the subtraction of a and is " + c);
        c = a / b;
        System.out.println("the division of a and b is " + c);
        c = a * b;
        System.out.println("The multiplication of and b is " + c);
        c = a % b;
        System.out.println("The modelous of a and b is " + c);
    }

}
