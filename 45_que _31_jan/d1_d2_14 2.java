import java.util.Scanner;
public class d1_d2_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p,d1,d2,a;
        System.out.println("Enter the pearpendicular");
        p=sc.nextFloat();
        System.out.println("Enter the diagonal");
        d1=sc.nextFloat();
        System.out.println("Enter the diagonal");
        d2=sc.nextFloat();
        a=((p/2)*d1)+((p/2)*d2);
        System.out.println("The area of quadriletral is "+a);

        
    }
    
}
