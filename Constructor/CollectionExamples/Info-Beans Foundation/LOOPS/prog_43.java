import java.util.Scanner;
import java.lang.Math;
public class prog_43 {
    //WAP to convert binary number into decimal number
    public static void main(String[] args) {
        int num, rem,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bits");
        num = sc.nextInt();


        for (int i = 0; num>0; i++) {
                rem = num % 10;
                sum=sum+(rem*(int)Math.pow(2, i));
                num=num/10;
            }
        System.out.println(sum);
    }
}
