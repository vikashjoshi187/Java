import java.util.Scanner;
public class digit_astrsk_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.print("Enter a character \n");
        a=sc.next().charAt(0);
        if(a>=48 && a<=57 ){
            a=42;
            System.out.println("The entered char is "+(char)a);
        }
        else{
            System.out.println("Not a digit");
        }


    }
}
