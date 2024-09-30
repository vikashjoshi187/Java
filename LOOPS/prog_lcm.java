import java.util.Scanner;
public class prog_lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,lnum,temp=1;
        System.out.println("Enter a number 1");
        num1=sc.nextInt();
        System.out.println("Enter a number 2");
        num2=sc.nextInt();
         lnum=(num1>num2)?num1:num2;
         
         while (temp==1) {
            if (lnum%num1==0 && lnum%num2==0) {
                System.out.println(lnum);
                break;
                }
                lnum++;
            }


    }
}
