import java.util.Scanner;

public class grade_5_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, p;
        System.out.println("Enter marks of sub 1");
        a = sc.nextInt();
        System.out.println("Enter marks of sub 2");
        b = sc.nextInt();
        System.out.println("Enter marks of sub 3");
        c = sc.nextInt();
        System.out.println("Enter marks of sub 4");
        d = sc.nextInt();
        System.out.println("Enter marks of sub 5");
        e = sc.nextInt();
        p = (a + b + c + d + e) / 5;
        if (p >= 75) {
            System.out.println("A grade");
        } else {
            if (p >= 60 && p < 75) {
                System.out.println("B grade");
            } else {
                if (p >= 50 && p < 60) {
                    System.out.println("C grade");
                } else {
                    if (p >= 33 && p < 50) {
                        System.out.println("D grade");

                    } else {
                        System.out.println("Fail");
                    }
                }
            }
        }
    }
}
