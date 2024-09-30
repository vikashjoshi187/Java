// length from millimeter to inches
import java.util.Scanner;
class Mmtoin
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("length in Millimeter : ");
        Double Mm = sc.nextDouble();
        Double inch = Mm/25.4;
        System.out.println("Millimeter to inches : "+inch);
    }
}