// Relational Operator
import java.util.Scanner;
class Relational
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of a and b : ");
        int a,b;
        a = sc.nextInt(); b = sc.nextInt();
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b); 
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}