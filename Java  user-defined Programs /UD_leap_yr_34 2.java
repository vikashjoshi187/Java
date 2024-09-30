import java.util.Scanner;


public class UD_leap_yr_34 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the yr number");
        int yr=sc.nextInt();
       String s= ((yr%4==0)&&(yr%100!=0)||(yr%400==0))?yr+" is leap year":yr+" is not leap year";
        System.out.println(s);
    }

   
        
    }
    

