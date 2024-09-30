// Greater number between four number
import java.util.Scanner;
class Greater2
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of a,b,c and d : ");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Double d = sc.nextDouble();
        String A = (a>b && a>c && a>d)?(a+" is Greater"):(b>c && b>d)?
        (b+" is Greater"):(c>d)?(c+" is Greater"):(d+" is Greater");
        System.out.println(A);
    }
}