import java.util.Scanner;
public class ab_cone_43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double h,sh,r,ac,tc,p;
        double pi=3.14;
        System.out.println("Enter the height ");
        h=sc.nextDouble();
        System.out.println("Enter the slant height ");
        sh=sc.nextDouble();
        System.out.println("Enter the price per cm sq ");
        p=sc.nextDouble();
        r=Math.sqrt(Math.pow(sh, 2)-Math.pow(h, 2));
        ac=pi*r*r;
        System.out.println("The area of base is "+ac);
        tc=ac*p;
        System.out.println("The total price will be "+tc);

    }
    }

