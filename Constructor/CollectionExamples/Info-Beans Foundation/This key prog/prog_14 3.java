import java.util.Scanner;

public class prog_14 {
    // WAP to print table of a number.
    int num;

    void setData(int num) {
        this.num = num;
    }

    void table() {
        int mul = 0;
        for (int i = 1; i <= 10; i++) {
            mul = num * i;
            System.out.println(mul);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table");
        int table = sc.nextInt();
        prog_14 obj = new prog_14();
        obj.setData(table);
        obj.table();

    }
}
