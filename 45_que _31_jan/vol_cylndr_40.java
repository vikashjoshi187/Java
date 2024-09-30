import java.util.Scanner;
public class vol_cylndr_40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pi=3.14f;
        float r,h,vc;
        System.out.println("Enter the radius ");
        r=sc.nextFloat();
        System.out.println("Enter  the height ");
        h=sc.nextFloat();
        vc=(pi*r*r)*h;
System.out.println("the volume of cylinder is "+vc);

    }
}
