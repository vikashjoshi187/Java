import java.util.Scanner;
public class prog_47 {
    /*
A
BCD
EFGHI
JKLMNOP
QRSTUVWXY
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int chr=65;
        for (int i = 1; i <= num; i++) {


            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print((char)chr);
                chr++;
            }
            System.out.println();

            

            
        }

    }
}
