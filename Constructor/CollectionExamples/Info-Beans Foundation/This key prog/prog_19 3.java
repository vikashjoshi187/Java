import java.util.Scanner;

public class prog_19 {
    // WAP to print Fibonacci series.
    int num;

    void setData(int num) {
        this.num = num;
    }

    void fibonacchi() {
        int firstTerm = 0, lastTerm = 1;
        System.out.print(firstTerm);
        for (int i = 0; i < num; i++) {
            int nextTerm = firstTerm + lastTerm;
            firstTerm = lastTerm;
            lastTerm = nextTerm;
            System.out.print("\t" + firstTerm);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        prog_19 obj = new prog_19();
        obj.setData(num);
        obj.fibonacchi();
    }
}
