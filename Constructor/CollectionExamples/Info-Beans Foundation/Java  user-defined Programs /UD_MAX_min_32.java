import java.math.MathContext;
import java.util.Scanner;
import java.lang.Math;
public class UD_MAX_min_32 {
    public static void main (String argd[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max =((a+b)+Math.abs(a-b))/2;

        System.out.println("Maximum no is "+max);
        int min =((a+b)-Math.abs(a-b))/2;

        System.out.println("The mini num is "+min);

    }
    
}
