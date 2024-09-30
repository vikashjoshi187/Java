import java.util.Scanner;
public class srfc_ars_35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pie=3.14f;
        float r,h,sa;
        System.out.println("Enter the radius and height in sequence");
r=sc.nextFloat();
h=sc.nextFloat();
sa=(2*pie*r*h)+(2*pie)*r*r;
System.out.println("The surface area of cylinder is "+sa);

    }
    
}
