import java.util.Scanner;
public class height_cylndr_38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float vc,r,h,ar;
        float pie =3.14f;
        System.out.println("Enter the area of cylinder");
        vc=sc.nextFloat();
        System.out.println("Enter the radius ");
        r=sc.nextFloat();
        h=(vc/(pie*r*r));
        System.out.println("The height of cylender is "+h);
        ar=(2*pie)*r*(r+h);
        System.out.println("the ara of cylinder is "+ar);
    }
}
