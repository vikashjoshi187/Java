// numbers are equal or not if not find out greater number
import java.util.Scanner;
class Eqornot
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out .println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = (a==b)?("both number are equal"):(a>b)?(a+" is greater"):
        (b+" is greater");
        System.out.println(s);
    }
}