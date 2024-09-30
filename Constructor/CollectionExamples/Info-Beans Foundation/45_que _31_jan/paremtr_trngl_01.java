import java.lang.Math;
import java.util.Scanner;
public class paremtr_trngl_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p,l;
        double b,area;
        System.out.println("Enter Paremeter");
        p=sc.nextInt();
        System.out.println("Enter lenght");
        l=sc.nextInt();
        b=(p/2.0)-l;
        System.out.println("Breath is eqaul to"+b);
        area=l*b;
        System.out.println("Area is eqal to "+area);
    }
}



