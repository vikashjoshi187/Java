//Meter to feet
import java.util.Scanner;
class Mtof
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("length in meter : ");
        Double m = sc.nextDouble();
        Double f = m*3.281;
        System.out.println("meter to feet : "+f); 
    }
}