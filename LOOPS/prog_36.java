import java.util.Scanner;

public class prog_36 {
    // WAP to reverse a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tem = 0, temp1;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num > 0) {

            temp1 = num % 10;
            tem = (tem * 10) + temp1;
            num = num / 10;
        }
        System.out.println(tem);

    }
}
