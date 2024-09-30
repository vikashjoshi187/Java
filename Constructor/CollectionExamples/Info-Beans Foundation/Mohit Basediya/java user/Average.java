// program to find average
import java.util.Scanner;
class Average 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of a,b,c,d and e : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("Total : "+sum);
        double avg = (a+b+c+d+e)/5.0;
        System.out.println("Average : "+avg);
    }
}