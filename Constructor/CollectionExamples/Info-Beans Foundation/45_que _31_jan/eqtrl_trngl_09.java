import java.lang.Math;
import java.util.Scanner;
public class eqtrl_trngl_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s,a;
        double h;
        System.out.println("Enter the side of tringle");
        s=sc.nextDouble();
        h=Math.sqrt(3/4)*s;
        a=(h*s)/2;
        System.out.println("The area of triangle is "+a);
    }
}
