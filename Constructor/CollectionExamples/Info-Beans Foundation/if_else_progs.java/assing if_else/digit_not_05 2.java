import java.util.Scanner;
public class digit_not_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.print("Enter a character \n");
        a=sc.next().charAt(0);
        if(a>=48 && a<=57 ){
            System.out.println("Its an digit");
        }
        else{
            System.out.println("Not a digit");
        }


    }
}
