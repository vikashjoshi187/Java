// if principal is greater or equal than 500 than find Ci otherwise find SI
import java.util.Scanner;
class Ciorsi
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of p,r and t : ");
        int p = sc.nextInt();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        double si = (p*r*t)/100;
        double ci = (p*Math.pow(1+r/100,t))-p;
        String A = (p>=500)?("Compound Interest : "+ci):("Simple Interest : "+si);
        System.out.println(A);
    }
}