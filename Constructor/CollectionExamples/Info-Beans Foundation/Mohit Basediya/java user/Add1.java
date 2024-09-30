// Program to add two numbers without (+) operator.
import java.util.Scanner;
class Add1
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a-(-b);
        System.out.println("Addition of two numbers : "+c);
    }
}