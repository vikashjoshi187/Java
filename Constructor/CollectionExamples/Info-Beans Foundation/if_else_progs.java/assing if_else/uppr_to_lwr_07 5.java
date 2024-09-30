import java.util.Scanner;

public class uppr_to_lwr_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character  ");
        char a;
        a= sc.next().charAt(0);
        if (a >= 65 && a<=90) {
            System.out.println("lower case will be "+(char)(a+32));

        } 
        else {
            System.out.println("its  upper case "+(char)a);
        }

    }

}
