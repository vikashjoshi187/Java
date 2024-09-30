import java.util.Scanner;

public class prog_15 {
    int cal(int num) {
        int a;
        int temp = num, count = 0, rem, sum = 0, i;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        for (i = 0; i < count; i++) {
            rem = num % 10;
            sum = sum + rem * (int) Math.pow(2, i);
            num = num / 10;
        }
        System.out.println(" Binary to Decimal : " + sum);
        a = sum;
        return a;
    }

    public static void main(String args[]) {
        prog_15 ob = new prog_15();
        Scanner ip = new Scanner(System.in);
        System.out.println(" Enter number ");
        int num = ip.nextInt();
        int a = ob.cal(num);
        System.out.println("" + a);
    }
}