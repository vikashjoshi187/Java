import java.util.Scanner;
public class alpha_not_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.print("Enter a character \n");
        a=sc.next().charAt(0);
        if(a>=65 && a<=90 || a>=97 && a<=122){
            System.out.println("Its an alphabet");
        }
        else{
            System.out.println("Not a alphabet");
        }


    }
}
