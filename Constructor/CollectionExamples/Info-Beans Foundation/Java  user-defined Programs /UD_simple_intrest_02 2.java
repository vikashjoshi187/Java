
import java.util.Scanner;
class UD_simple_intrest_03{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter time \n princlple and rate in sequence");
        float si;
        int t=sc.nextInt();
        float p=sc.nextFloat();
        float r =sc.nextFloat();
        si=(p*r*t)/100;
    System.out.println("the simple interest is "+si);


    }
}