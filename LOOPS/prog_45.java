import java.util.Scanner;
public class prog_45 {
    //WAP to find out the sum of all the digits of a number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter a number");
        num=sc.nextInt();
        while (num>0) {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("the sum of numbers is  "+sum);
    }
}
