import java.util.Scanner;
public class UD_swp_two_06 {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the value of a is "+a+"\n the value of b is "+b);
    }
}
