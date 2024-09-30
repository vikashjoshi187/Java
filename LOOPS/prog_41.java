import java.util.Scanner;
public class prog_41 {
    //WAP to find out LCM of a number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,lnum;
        System.out.println("Enter a number 1");
        num1=sc.nextInt();
        System.out.println("Enter a number 2");
        num2=sc.nextInt();
         lnum=(num1>num2)?num1:num2;
         
         while (true) {
            if (lnum%num1==0 && lnum%num2==0) {
                System.out.println("The least common factor is "+lnum);
                break;
                }
                lnum++;
            }
        }
}
