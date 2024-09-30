// Number is even or not
import java.util.Scanner;
class Eoro
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number : ");
        int a = sc.nextInt();
        String A = (a%2==0)?(a+" is even"):(a+" is odd");
        System.out.println(A);
    }
}