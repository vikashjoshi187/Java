import java.util.Scanner;

public class prog_49 {
    // 49)WAP to print Fibonacci series.
    void prntFibon(int num) {
        Scanner sc = new Scanner(System.in);

        int a = -1, b = 1, c;
        for (int i = 0; i <= num; i++) {
            c = a + b;
            System.out.print("\t" + c);
            a = b;
            b = c;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog_49 obj = new prog_49();
        System.out.println("Enter a range for printng  Fibonacci series");
        int nm = sc.nextInt();
        obj.prntFibon(nm);
    }
}
