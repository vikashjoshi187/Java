import java.util.Scanner;

public class prog_18 {
    // WAP to print Fibonacci series.
    int num;

    void setData(int num) {
        this.num = num;
    }

    void fibonacchi() {
        int a = 0, b = 1;
        for (int i = 0; i <= num; i++) {

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        prog_18 obj = new prog_18();
        obj.setData(num);
        obj.fibonacchi();
    }
}
