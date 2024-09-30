import java.util.Scanner;
public class ci_si_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time princlple and rate in sequence");
        float si,ci;
        int t=sc.nextInt();
        float p=sc.nextFloat();
        float r =sc.nextFloat();
        if(p>=500){
          System.out.println("The compound interst is "+p*(1+r/100)*t);
        }
        else{
            System.out.println("The simple intrest is "+((p*r*t)/100));
        }
    }
}
