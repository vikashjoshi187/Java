// Area of Triangle
import java.util.Scanner;
class Aot 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of a,b and c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = (a+b+c)/2;
        System.out.println("Semiperimeter : "+s);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle : "+area);
    }
}