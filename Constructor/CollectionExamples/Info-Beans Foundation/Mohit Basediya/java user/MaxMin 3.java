// Prigram to find maximum and minimum of two number without using loop or any conditional operator.
import java.util.Scanner;
class MaxMin
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = ((a+b)+Math.abs(a-b))/2;
        int min = ((a+b)-Math.abs(a-b))/2;
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
    }
}