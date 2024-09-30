import java.util.Scanner;
public class srfc_ars_39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float d,h,r,sa;
        float pi=3.14f;
        System.out.println("Enter the diemeter of cylinder");
        d=sc.nextFloat();
        System.out.println("Enter the height ");
        h=sc.nextFloat();
        r=d/2;
        sa=(2*pi*r*h)+(2*pi)*r*r;
        System.out.println("The surface area is "+sa);
    }
}
