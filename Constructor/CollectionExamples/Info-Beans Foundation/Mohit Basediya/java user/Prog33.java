// Program to print sum of two integers without (+) sign.
import java.util.Scanner;
class Prog33
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a & b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a-(-b);
        System.out.println("sum of numbers : "+c);
    }
}