// Percentage lies between 75 and 100 or not
import java.util.Scanner;
class Per2
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of a,b,c,d and e : ");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Double d = sc.nextDouble();
        Double e = sc.nextDouble();
        double per = ((a+b+c+d+e)*100)/500;
        String A = (per>=75 && per<=100)?("percentage lies between 75 and 100"):
        ("percentage is less than 75");
        System.out.println(A);
    }
}