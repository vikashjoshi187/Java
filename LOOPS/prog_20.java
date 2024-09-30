import java.util.Scanner;

public class prog_20 {
    // 0 7 14 21 28 35 …..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();

        for (int i = 0; i <= num*7; i=i+7) {
            System.out.println(i);
            
        }
    }

}
