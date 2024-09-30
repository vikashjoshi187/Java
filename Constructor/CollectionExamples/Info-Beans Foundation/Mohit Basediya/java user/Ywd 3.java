// program to convert Days in Years,Weeks And Days
import java.util.Scanner;
class Ywd
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number in days : ");
        int a = sc.nextInt();
        int Y = a/365;
        a = a%365;
        int W = a/7;
        int D = a%7;
        System.out.println("Years : "+Y);
        System.out.println("Weeks : "+W);
        System.out.println("Days : "+D);
    }
}