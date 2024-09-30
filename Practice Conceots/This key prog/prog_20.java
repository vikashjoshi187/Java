import java.util.Scanner;

public class prog_20 {
    // WAP to print N even numbers.
    int num;

    void setData(int num) {
        this.num = num;
    }

    void even() {
        for (int i = 0; i < num; i++) {
            int mul = 2 * i;
            System.out.print("\t " + mul);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Term");
        int num = sc.nextInt();
        prog_20 obj = new prog_20();
        obj.setData(num);
        obj.even();
    }
}
