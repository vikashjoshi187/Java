import java.util.Scanner;
public class UD_alpha_no_17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char a=sc.next().charAt(0);
       String s= (a>=65 && a<=90 && a>=97 && a<=122)? a+"is a alphabat":a+"is not alphbat";
    System.out.println(a);
    }
}
