import java.util.Scanner;

public class prog_14 {
    // prime number
    String check(int num) {
        String s;
        int i;
        for (i = 2; i <=num / 2; i++) {
            if (num % i == 0) {
                break;
            }
        }
        if (num>0 && i > num / 2) {
            s = " Prime Number";
        } else {
            s = " Not Prime Number";
        }
        return s;
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println(" Enter Number : ");
        int num = ip.nextInt();
    prog_14 ob = new prog_14();
        String s = ob.check(num);
        System.out.println(" Number is " + s);
    }
}