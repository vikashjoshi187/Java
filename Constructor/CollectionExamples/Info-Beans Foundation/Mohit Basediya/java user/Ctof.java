// conversion from celsius to fehrenheit
import java.util.Scanner;
class Ctof
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature in celsius : ");
        double c = sc.nextDouble();
        double f = (c*9/5)+32;
        System.out.println("Celsius to Fehrenheit : "+f);
    }
}