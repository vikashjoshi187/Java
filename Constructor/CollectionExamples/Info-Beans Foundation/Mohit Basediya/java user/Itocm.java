// height from inches to cm
import java.util.Scanner;
class Itocm
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("height in inches : ");
        double in = sc.nextInt();
        double cm = in*2.54;
        System.out.println("inches to cm : "+cm);
    }
}