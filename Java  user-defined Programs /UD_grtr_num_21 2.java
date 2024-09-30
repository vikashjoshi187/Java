import java.util.Scanner;
public class UD_grtr_num_21 {
    public static void main(String args[]){
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter two numbers");

      int a=sc.nextInt();
      int b=sc.nextInt();
      String s =(a>b)?a+" is greater":(a<b)?b+" is greater":"Both are equal";
  System.out.println(s);
    } 
  }
  
