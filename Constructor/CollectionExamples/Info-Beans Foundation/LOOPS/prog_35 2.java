import java.util.Scanner;

public class prog_35 {
    //WAP to count number of digits
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count=0;
        for (; num > 0;) {
            count++;
            num=num/10;
        }
        System.out.println(count);
    }

}
