import java.util.Scanner;
public class prog_16 {
    // program to print -6,-3,0,3,6,9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strting number");
        int s = sc.nextInt();
        System.out.println("Enter number of terms");
        int t = sc.nextInt();
         s=s-3;
      for (int i = 1; i <= t; i++) {
            s=s+3;
            System.out.println(s);
        }

    }
}
