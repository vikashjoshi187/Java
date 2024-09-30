import java.util.Scanner;

// WAP to find out the factors of a number.
public class prog_16 {
    int num;

    void setData(int num) {
        this.num = num;
    }

    void factor() {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Factor of number is : " + i);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        prog_16 obj = new prog_16();
        obj.setData(num);
        obj.factor();
    }
}
