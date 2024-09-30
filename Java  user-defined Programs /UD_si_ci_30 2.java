import java.util.Scanner;
import java.lang.Math;
public class UD_si_ci_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time princlple and rate in sequence");
        float si,ci;
        int t=sc.nextInt();
        float p=sc.nextFloat();
        float r =sc.nextFloat();
        String s= (p>=500)?( "The compound interst is "+p*(1+r/100)*t):( "The simple intrest is "+((p*r*t)/100));
        System.out.println(s);
    }
    
}
