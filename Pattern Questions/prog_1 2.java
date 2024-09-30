import java.util.Scanner;
public class prog_1 {
    // *******

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of stars");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("* ");
        }
    }
}