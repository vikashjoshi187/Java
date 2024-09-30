import java.util.Scanner;
public class nt_trm_44 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n1,n2,n3,n4,at,nt,d;
       System.out.println("Enter the num1");
       n1=sc.nextInt();
       System.out.println("Enter the num1");
       n2=sc.nextInt(); 
       System.out.println("Enter the num1");
       n3=sc.nextInt(); 
       System.out.println("Enter the num1");
       n4=sc.nextInt(); 
       System.out.println("Enter the nth term ");
       nt=sc.nextInt();
       d=n2-n1;
       at=n1+(nt-1)*d; 
       System.out.println("The nth term will be "+at);
    
    
    }
}
