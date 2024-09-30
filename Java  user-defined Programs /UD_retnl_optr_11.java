import java.util.Scanner;
public class UD_retnl_optr_11 {
    public static void main(String args[]) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter two numbers");
        int b=sc.nextInt();
        int a =sc.nextInt();
        String c = (a > b) ? "a is bigger" : "b is bigger";

        System.out.println(c);
        c = (a < b) ? "b is bigger" : "a is smaller";
        System.out.println("the values of a and b is " + a + " " + b);
        System.out.println(c);

        c = (a > b) ? "b is smaller" : "a is bigger";
        System.out.println("the values of a and b is " + a + " " + b);
        System.out.println(c);

        c = (a >= b) ? "a is greater or equal to b" : "b is smaller than or equal to b";
        System.out.println("the values of a and b is " + a + " " + b);
        System.out.println(c);

        c = (a <= b) ? "a is smaller or equal to b" : "b is greater than or equal to b";
        System.out.println("the values of a and b is " + a + " " + b);
        System.out.println(c);
        a = 10;
        b = 10;
        c = (a != b) ? "a b are not equal" : "a and b are equal";
        System.out.println("the values of a and b is " + a + " " + b);
        System.out.println(c);

    }
}
