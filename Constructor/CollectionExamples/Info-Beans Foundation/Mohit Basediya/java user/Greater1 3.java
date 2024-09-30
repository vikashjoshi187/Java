// Greater number between three number
import java.util.Scanner;
class Greater1
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of a,b and c : ");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        String A = (a>b && a>c)?(a+" is greater"):(b>c)?
        (b+" is greater"):(c+" is greater");
        System.out.println(A);
    }
}