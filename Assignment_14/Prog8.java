/*Create a Thread class to print following star(*) pattern on screen with delay of 1
second between each * print. Number of lines in the pattern should be passed
to the constructor of Thread class.
* * * * 
* * *
* *
*
Use this class in main method and ask user to enter number of lines to print. */

import java.util.*;
public class Prog8 extends Thread {
    static Scanner sc = new Scanner(System.in);
    int num;

    Prog8(int num) {
        this.num = num;
    }

    public void run() {
        for (int i = num; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("Exception : " + e);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        Prog8 obj = new Prog8(num);
        obj.start();
    }
}
