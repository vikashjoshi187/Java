import java.util.Scanner;
public class prog_32 {
    /*
*
**
***
****
*****
******
*****
****
***
**
*
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num = sc.nextInt();


        for (int i = 1; i <= (num/2)+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }


        for (int i = num/2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
}
