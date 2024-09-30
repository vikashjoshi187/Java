// Program to find enter year is leap or not.
import java.util.Scanner;
class LeapYear
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Year : ");
        int a = sc.nextInt();
        String Y = (a%4==0 && a%100!=0 || a%400==0)?("Year is a Leap Year."):
        ("Year is not a Leap Year.");
        System.out.println(Y);
    }
}
