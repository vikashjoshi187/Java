import java.util.Scanner;
import java.lang.Math;
///WAP to check whether entered number is Armstrong or not
public class prog_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num, digit = 0, num2, temp1=0, temp3 = 0;
        System.out.println("enter a number");
        num = sc.nextInt();
        num2 = num;
        while (num2 > 0) {
            digit++;
            num2 = num2 / 10;
        }
        num2 = num;
    while (num2 > 0) {
        temp1 = num2 % 10;
            temp3 = temp3+(int)Math.pow(temp1,digit);
            num2=num2/10;
        }
        if (temp3==num) {
            System.out.println("arm");
        }
        else{
            System.out.println("not aarm strong");
        }
        System.out.println(temp3);
    }
}
