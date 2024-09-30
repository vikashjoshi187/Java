import java.util.Scanner;

public class prog_11 {
    // Program to find out compound interest if principal is greater than or equals
    // to 500 otherwise find out simple interest
    Scanner sc = new Scanner(System.in);
    int p, rate, t;

    void setData(int p, int rate, int t) {
        this.p = p;
        this.rate = rate;
        this.t = t;
    }

    double Ci() {
        if (p > 500) {
            double ci = p * (int) Math.pow((1 + (rate / 100)), t);
            return ci;
        } else {
            double si = (p * rate * t) / 100;
            return si;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        int p = sc.nextInt();
        System.out.println("Enter rate");
        int rate = sc.nextInt();
        System.out.println("Enter time");
        int time = sc.nextInt();
        prog_11 obj = new prog_11();
        obj.setData(p, rate, time);
        double x = obj.Ci();
        if (x == 1) {
            System.out.println("Compound intrest is : " + x);
        } else {
            System.out.println("Simple intrest is : " + x);
        }
    }
}
