import java.util.Scanner;

public class UD_upr_to_lwr_12 {
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter upper case a character");
        char a=sc.next().charAt(0);
        String s=(a>=65 && a<=90)?a+" it's lower case will be "+(char)(a+32):a+"is lower case";
System.out.println(s);
    }
    
}


