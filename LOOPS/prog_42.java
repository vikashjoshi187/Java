import java.util.Scanner;
public class prog_42 {
    //WAP to find out HCF of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,hnum,hcf=1;
        System.out.println("Enter a number 1");
        num1=sc.nextInt();
        System.out.println("Enter a number 2");
        num2=sc.nextInt();
         hnum=(num1<num2)?num1:num2;  
         for (int i = 1; i <= hnum; i++) {
            if (num1%i==0 && num2%i==0) {
                hcf=i;
            }
            
         }
         System.out.println("The highest common factor is  "+hcf);

    }
}
