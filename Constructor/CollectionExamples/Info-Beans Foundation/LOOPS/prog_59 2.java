import java.util.Scanner;
public class prog_59 {
    //WAP to find out the sum of all integer between 100 and 200 which are divisible by 9
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,sum=0;
        System.out.println("Enter a number 1");
        num1=sc.nextInt();
        System.out.println("Enter a number 2");
        num2=sc.nextInt();
        for (int i = num1; i < num2; i++) {

            if (i%9==0) {
                sum=sum+i;
                
            }
            
        }
        System.out.println(sum);

        
    }
}
