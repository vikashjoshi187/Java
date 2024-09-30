import java.util.Scanner;

public class prog_24 {
    // WAP to print Alphabets in reversing order.
    void show() {
        for (int i = 90; i >= 65; i--) {
            System.out.print("\t" + (char) (i));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_24 obj = new prog_24();
        obj.show();
    }
}
