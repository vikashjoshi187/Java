import java.util.Scanner;

import javax.xml.transform.Source;

public class prog_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 1;
        System.out.println("Enter number");
        num = sc.nextInt();

        for (int i = 1; i <= (num / 2); i++) {
            if (num % i != 0) {
                count++;
            }
        }
        if (count == num / 2) {
            System.out.println(num + " is a prime number");

        } else {
            System.out.println("NOT A PRIME NUMBER");
        }

    }
}
