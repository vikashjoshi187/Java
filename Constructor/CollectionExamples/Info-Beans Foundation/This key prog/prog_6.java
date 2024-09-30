
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

public class prog_6 {
    // Program to find out greater number between two numbers using conditional
    // operator
    int num1, num2;

    void setData(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void Greater() {
        String s = (num1 == num2) ? "Both are equal" : (num1 > num2) ? num1 + "is greater" : num2 + " is greater";
        System.out.println(s);
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
