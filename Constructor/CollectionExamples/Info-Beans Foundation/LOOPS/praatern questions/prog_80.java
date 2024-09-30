import java.util.Scanner;
public class prog_80 {
    /*
x
xx
xxx
xxxx
xxxxx
xxxxxx
xxxxx
xxxx
xxx
xx
x
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num = sc.nextInt();


        for (int i = 1; i <= (num/2)+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
            
        }


        for (int i = num/2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
            
        }

    }
}
