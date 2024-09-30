// Greater number between two number
import java.util.Scanner;
class Greater
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of num1 and num2 : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        String a = (num1>num2)?(num1+" is greater"):(num2+" is greater");
        System.out.println(a);
    }
}