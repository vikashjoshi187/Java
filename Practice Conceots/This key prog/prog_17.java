import java.util.Scanner;

public class prog_17 {
    // WAP to check whether entered number is prime or not.
    int num;

    void setData(int num) {
        this.num = num;
    }

    void prime() {
        int i;
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                break;
        }
        if (i > num / 2 && num > 1) {
            System.out.println(" Prime number");
            // return 1;/
        } else
            System.out.println("not prime number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        prog_17 obj = new prog_17();
        obj.setData(num);
        obj.prime();

    }
}
