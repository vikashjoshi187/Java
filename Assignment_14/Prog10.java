/*10. Print Output like this : hii hii hii hii HELLO hii hii hii hii hello hii hii hii hii HELLO .... using thread */

import java.util.Scanner;
public class Prog10 implements Runnable {
    static Scanner sc = new Scanner(System.in);
    public void run() {
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 5 != 0) {
                System.out.print("hii" + "    ");
            } else {
                System.out.print("    " + "hello" + "   ");
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Prog10()).start();
    }
}
