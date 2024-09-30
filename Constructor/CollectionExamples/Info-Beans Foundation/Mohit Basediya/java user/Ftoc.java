// fehrenheit to celsius
import java.util.Scanner;
class Ftoc
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("temperature in fehrenheit : ");
        double f = sc.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("fehrenheit to celsius : "+c);
    }
}