import java.util.Scanner;

public class nest_f_else_03 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        System.out.println("Enter the value of c");
        c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is bigger");
            } else {
                System.out.println(c + " is bigger");
            }

        }
       else {
        if (b > c) {
            System.out.println(b + " is bigger");

        } 
        else {
            System.out.println(c + " is bigger");
        }
       }

    }
}
