import java.util.Scanner;
public class prog_40 {
    /*
EEEEE
DDDD
CCC
BB
A
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = (num+65)-1; i >= 65; i--) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char)i);
            }
            System.out.println();
        }

    }
}
