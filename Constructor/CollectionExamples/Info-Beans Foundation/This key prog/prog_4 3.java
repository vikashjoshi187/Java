import java.util.Scanner;

public class prog_4 {
    // WAP to convert temp from f to c
    double f;

    void setData(double f) {
        this.f = f;
    }

    double Convesion() {
        double c = (f - 32) * (5 / 9);
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fehrenhite");
        double f = sc.nextDouble();
        prog_4 obj = new prog_4();
        obj.setData(f);
        double x = obj.Convesion();
        System.out.println("Convert temp from f to c is :" + x);
    }
}
