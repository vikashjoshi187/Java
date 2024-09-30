// Arithmetic Operator
import java.util.Scanner;
class Arithmetic
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c,d,e,f,g;
        c=a+b;d=a-b;e=a*b;f=a/b;g=a%b;
        System.out.println("Addition : "+c);
        System.out.println("Substraction : "+d);
        System.out.println("Multiplication : "+e);
        System.out.println("Division : "+f);
        System.out.println("Modulus : "+g);
    }
}