import java.util.Scanner;
public class dimter_cylndr_37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float sa,h,d,r;
        float pie=3.14f;
        System.out.println("Enter the surface area od cylinder");
        sa=sc.nextFloat();
        System.out.println("Enter the height ");
        h=sc.nextFloat();
        r=(sa/(h*pie)*2);
        d=r*2;

        System.out.println(d);
    }
}
