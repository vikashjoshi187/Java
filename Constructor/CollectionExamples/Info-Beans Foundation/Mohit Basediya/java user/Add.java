// program to find add
import java.util.Scanner;
class Add 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum : "+c);
    }
}