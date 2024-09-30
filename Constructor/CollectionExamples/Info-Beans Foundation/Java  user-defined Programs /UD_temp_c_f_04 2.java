import java.util.Scanner;

public class UD_temp_c_f_04 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the temperature in degree celcius");
        float c=sc.nextFloat();
       float f=(c*1.8f)+32;
       System.out.println("the temperature in f is "+f+"\n");

    }
}
