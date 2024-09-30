import java.util.Scanner;
//WAP to find out the factorial of a number.
public class prog_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A number");
        int num = sc.nextInt();
        int tem = 1;
        for (int i = 1; i <= num; i++) {

            tem = i * tem;


        }

        System.out.println(tem);

    }

}
