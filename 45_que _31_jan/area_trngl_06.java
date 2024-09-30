import java.util.Scanner;
import java.lang.Math;
public class area_trngl_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s1,s2,s3,p,area,s,a;
        System.out.println("Enter the side 2 side 2 and perimeter in sequence");
        s1=sc.nextDouble();
        s2=sc.nextDouble();
        p=sc.nextDouble();
        s3=p-(s1+s2);
        s=p/2;
        a=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("The are of triangle is "+a);



        
    }
    
}
