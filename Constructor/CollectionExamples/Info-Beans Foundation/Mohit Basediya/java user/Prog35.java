/* Program to multiply a number by 2 without using (*) sign.
Ex :- input 2, output 4. */
import java.util.Scanner;
class Prog35
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        a = a<<1;
        System.out.println("number multiply by 2 : "+a);
    }
}