
import java.util.Scanner;
public class QUAT_EQU_43{
    public static void main(String athd[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value at a :");
        float a =sc.nextFloat();
        System.out.println("Enter valuer at b :");
        float b = sc.nextFloat();
        System.out.println("Enter value at c :");
        float c =sc.nextFloat();
        double d,r1 , r2;

        d = (b*b) - 4*a*c;
        if(d>0){
            r1 = (-b +Math.sqrt(d))/2*a;
            r2 = (-b -Math.sqrt(d))/2*a;
            System.out.println("root 1 = "+r1);
            System.out.println("root 2 = "+r2);
        }
        else if(d==0){
            r1 = -b/2*a;
          System.out.println("root  = "+r1);

        }
        else {
         r1 =-b/2*a;
         double rr1 = Math.sqrt(Math.abs(d))/2*a;
         r2 = -b/2*a;
         double rr2 = Math.sqrt(Math.abs(d))/2*a;
            System.out.println("root1 = "+(rr1+r1)+"i");
            System.out.println("root2 = "+(r2-rr2)+"i");
        }
    }
}