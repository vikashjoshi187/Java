import java.util.Scanner;
public class UD_lwr_to_upt_19{
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a lower case char");

        char a=sc.next().charAt(0);
        String s=(a>=97 && a<=122)?a+" it's upper case will be "+(char)(a-32):a+" is upper case";
System.out.println(s);
    }
    
}


