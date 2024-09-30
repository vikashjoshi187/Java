import java.util.Scanner;

public class spcl_chr_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.println("Enter a character");
        a=sc.next().charAt(0);
        if(a>= 33 && a<=47 || a>=58 && a<=64 || a>=91 && a<=96 || a>=123 && a<=126  ){
           System.out.println("it is a special char");
        }
        else{
            System.out.println("it is not a special char");
        }
     
    }
}
