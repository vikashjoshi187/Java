// percentage of 5 subjects
import java.util.Scanner;
class Per
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter marks of a,b,c,d and e : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double total = a+b+c+d+e;
        System.out.println("total marks: "+total);
        double per = (total*100)/500;
        System.out.println("Percentage : "+per);
        
    }
}