import java.util.Scanner;

public class vol_cylndr_41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double h,d,r;
        double vc;
        System.out.println("Enter the diemeter ");
        d=sc.nextDouble();
        System.out.println("Enter the height ");
        h=sc.nextDouble();
        r=d/2;
        vc=(Math.PI*r*r)*h;
        System.out.println("The volume of cylinder is "+vc);
    }
}
