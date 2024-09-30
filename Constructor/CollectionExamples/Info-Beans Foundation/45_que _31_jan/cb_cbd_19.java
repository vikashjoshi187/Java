import java.util.Scanner;
import java.lang.Math;
public class cb_cbd_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double ce,l,w,h,vc,vcd;
        System.out.println("Enter the edge of cube");
        ce=sc.nextDouble();
        vc=Math.pow(ce,3);
        System.out.println("Enter the length of cuboid");
        l=sc.nextDouble();
        System.out.println("Enter the width of cuboid");
        w=sc.nextDouble();
        System.out.println("Enter the height of cuboid");
        h=sc.nextDouble();
        vcd=l*w*h;
        String s=(vc>vcd)?"Voulume of cube is large":"volume of cuboid is large";
System.out.println(s);
    }

    
}