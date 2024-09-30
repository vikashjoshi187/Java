import java.util.Scanner;

public class prog_3 {
    // WAP to find out simple interest
    int p, r, t;

    void setData(int p, int r, int t) {
        this.p = p;
        this.r = r;
        this.t = t;
    }

    int Si() {
        int si = (p * r * t) / 100;
        return si;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_3 obj = new prog_3();
        System.out.println("Enter Principal");
        int p = sc.nextInt();
        System.out.println("Enter Rate");
        int r = sc.nextInt();
        System.out.println("Enter Time");
        int t = sc.nextInt();
        obj.setData(p, r, t);
        int x = obj.Si();
        System.out.println("Simple intrest is : ");
        System.out.println(x);
    }
}
