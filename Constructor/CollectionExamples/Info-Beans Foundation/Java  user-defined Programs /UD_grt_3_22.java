import java.util.Scanner;
public class UD_grt_3_22 {
    public static void main(String args[]){
      Scanner sc =new Scanner (System.in);
      System.out.println("Enter three numbers");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      String s =(a>b && a>c)?a+" is greater":(a<b && b>c )?b+" is greater":c+" is greater ";
  System.out.println(s);
    } 
  }
  



