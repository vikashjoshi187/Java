// Swapping of 2 numbers using third
import java.util.Scanner;
class Swap1
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c ;
        c=b;b=a;a=c;
        System.out.println("Swapped value : \n"+a+"\n"+b);
    }
}