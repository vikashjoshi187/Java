import java.lang.Math;
import java.util.Scanner;

public class UD_area_trngl_09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double A,s;
        System.out.println("Enter the sides of Trinagle");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
       s=(a+b+c)/2;
       A= Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("the area of trianglr is "+A);
    }
}
