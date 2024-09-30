import java.util.Scanner;
public class lower_not_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.print("Enter a character \n");
        a=sc.next().charAt(0);
        if(a>=97 && a<=122){
            System.out.println("lower case");
        }
        else{
            System.out.println("upper case");
        }


    }
}
