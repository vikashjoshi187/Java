import java.util.Scanner;

public class UD_swp_thrd_05 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("the value of a is " + a + "\n the value of b is " + b);

    }

}
