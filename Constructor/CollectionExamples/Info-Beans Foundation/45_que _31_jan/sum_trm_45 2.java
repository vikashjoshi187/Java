import java.util.Scanner;
public class sum_trm_45 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n1,n2,sum,nt,d;
       System.out.println("Enter the num1");
       n1=sc.nextInt();
       System.out.println("Enter the num1");
       n2=sc.nextInt();
       System.out.println("Enter the nth term ");
       nt=sc.nextInt();
       d=n2-n1;
       sum=nt/2*(2*n1+(nt-1)*d); 
       System.out.println("The sum if terms will be "+sum);
    
    
    }
}