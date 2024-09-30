// Feet to Meter
import java.util.Scanner;
class Ftom
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("length in feet : ");
        Double f = sc.nextDouble();
        Double m = f/3.281;
        System.out.println("feet to meter : "+m); 
    }
}