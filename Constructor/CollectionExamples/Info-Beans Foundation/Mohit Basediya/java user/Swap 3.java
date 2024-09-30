// Swapping of two variable
import java.util.Scanner;
class Swap
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a=a+b;b=a-b;a=a-b;// By Bitwise operator : a=a^b;b=a^b;a=a^b; 
        System.out.println("Swapped value : \n"+a+"\n"+b);
    }
}