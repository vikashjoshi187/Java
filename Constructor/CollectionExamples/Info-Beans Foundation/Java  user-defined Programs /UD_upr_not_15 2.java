import java.util.Scanner;
public class UD_upr_not_15 {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  charracter");
        char a=sc.next().charAt(0);
        String s=(a>=65 && a<=90)?a+" is upper case":a+" is not upper  case";
System.out.println(s);
    }
    
}
