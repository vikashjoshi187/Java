// volume of Cylinder
import java.util.Scanner;
class Voc
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of r and h : ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double pie = 3.14 ;
        double vol = pie*r*r*h;
        System.out.println("Volume of Cylinder : "+vol);
    }
}