import java.util.Scanner;

public class prog_25 {
    // WAP to check whether entered number is perfect or not
    int num;

    void setData(int num) {
        this.num = num;
    }

    int perfect() {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_25 obj = new prog_25();
        System.out.println("Enter number");
        int num = sc.nextInt();
        obj.setData(num);
        int x = obj.perfect();
        if (x == num) {
            System.out.println("Perfect number");
        } else
            System.out.println("Not perfect");
    }
}
