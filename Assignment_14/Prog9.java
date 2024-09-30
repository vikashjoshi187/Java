/*9. Create a class that checks whether a given number is prime or not using Runnable interface */

import java.util.Scanner;
public class Prog9 implements Runnable {
    static Scanner sc = new Scanner(System.in);
    public void run() {
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int i;
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                break;
            }
        }
        if (i > num / 2 && num > 1) {
            System.out.println("Prime number.......!! ");
        } else {
            System.out.println("Not prime number......!!");
        }
    }

    public static void main(String[] args) {
        new Thread(new Prog9()).start();
    }
}
