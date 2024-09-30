// Compound Interest
import java.util.Scanner;
class Ci 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of p,t,r : ");
        int p = sc.nextInt();
        int t = sc.nextInt();
        double r = sc.nextDouble();
        double amt = p*Math.pow(1+r/100,t);
        System.out.println("Amount : "+amt);
        double ci = amt-p;
        System.out.println("Compound Interest : "+ci);
    }
}