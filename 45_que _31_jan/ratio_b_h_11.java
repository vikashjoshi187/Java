import java.util.Scanner;
public class ratio_b_h_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float ar,hr,br;
        System.out.println("Enter the area of triangle");
        ar=sc.nextFloat();
        System.out.println("Enter the hr ");
        hr=sc.nextFloat();
        System.out.println("Enter the area of br");
        br=sc.nextFloat();
        double x=Math.sqrt(ar/br*hr);
        double h=x*5;
        double b=x*8;
        System.out.println("The base of triangle is "+b+"\n The height of triange is "+h);


        
    }
}
