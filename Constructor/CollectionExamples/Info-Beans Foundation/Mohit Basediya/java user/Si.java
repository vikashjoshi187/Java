// program for Simple Interest
import java.util.Scanner;
class Si
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter p,t,r : ");
        short p = sc.nextShort();
        short t = sc.nextShort();
        double r = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("Simple Interest : "+si);
    }
}
