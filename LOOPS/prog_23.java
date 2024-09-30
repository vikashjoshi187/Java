import java.util.Scanner;

public class prog_23 {
    //9	25	49	81	…..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Enter number of terms");
        t = sc.nextInt();
        int temp = 1, temp1 = 1;
        for (int i = 1; i <= t * 2; i++) {
            if (temp % 2 != 0) {
                System.out.println(temp);
            }
            temp = temp + (temp1 + 2);
            temp1 = temp1 + 2;

        }

    }

}
