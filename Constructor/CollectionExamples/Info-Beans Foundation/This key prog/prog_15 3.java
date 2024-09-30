import java.util.Scanner;

public class prog_15 {
    // WAP to find out the factorial of a number.
    int num;

    void setData(int num) {
        this.num = num;
    }

    int factorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        prog_15 obj = new prog_15();
        obj.setData(num);
        int x = obj.factorial();
        System.out.println("Factorial of number is");
        System.out.println(x);
    }
}
