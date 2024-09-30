/**
 * base_08
 */
import java.util.Scanner;
public class base_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float area,h,b;
        System.out.println("Enter the area of triangle ");
        area=sc.nextFloat();
        System.out.println("Enter the height of triangle ");
        h=sc.nextFloat();
        b=((area*2)/h)*10000;
        System.out.println("The base of trianle is "+b);


    }

    
}