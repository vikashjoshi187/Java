import java.util.Scanner;

public class prog_13 {
    // WAP to find out the sum of N natural number.
    int num;

    void setData(int num) {
        this.num = num;
    }

    int Natural() {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        prog_13 obj = new prog_13();
        obj.setData(num);
        int s = obj.Natural();
        System.out.println("Sum is :" + s);

    }
}
