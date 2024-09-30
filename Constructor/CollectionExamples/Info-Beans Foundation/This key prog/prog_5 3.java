import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class prog_5 {
    // Check if both numbers are equals or not, if not then find out the greatest
    // number
    int num1, num2;

    void setData(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void Greater() {
        if (num1 == num2)
            System.out.println("Both are equal");
        else if (num1 > num2)
            System.out.println(num1 + " is greater");
        else
            System.out.println(num2 + " is greater");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        prog_5 obj = new prog_5();
        obj.setData(num1, num2);
        obj.Greater();
    }
}
