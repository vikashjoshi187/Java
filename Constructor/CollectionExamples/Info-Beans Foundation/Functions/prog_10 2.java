import java.util.Scanner;
class prog_10 {
    // Program to round of 3 digit number.
    void round(int a) {
        int b, c;
        if (a > 99 && a < 1000) {
            b = a % 10;
            if (b > 0 && b < 5) {
                a = a - b;
                System.out.println("Round Off Value is : " + a);
            } else if (b >= 5 && b <= 9) {
                c = 10 - b;
                a = a + c;
                System.out.println("Round Off Value is : " + a);
            }
        } else
            System.out.println("Not a Three Digit Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        prog_10 obj = new prog_10();
        obj.round(num);
    }
}