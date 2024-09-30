import java.util.Scanner;
public class prog_46 {
    //WAP to find out the sum of first and last digit of a user entered number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,lnum,fnum=0;
        System.out.println("Enter a number");
        num=sc.nextInt();
         lnum=num%10;
         while (num>0) {
            fnum=num%10;
            num=num/10;        
        }
         System.out.println(fnum);
         System.out.println("the sum of first and last number is "+(lnum+fnum)); 

    }
    
}
