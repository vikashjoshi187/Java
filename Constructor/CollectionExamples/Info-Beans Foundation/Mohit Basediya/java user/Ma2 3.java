/* program to multiply a number by 2 without using (*) sign.
Ex : Input 2 Output 4*/
import java.util.Scanner;
class Ma2
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        a = a<<1;
        System.out.println(a);
    }
}