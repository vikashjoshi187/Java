import java.util.Scanner;
public class prog_39 {
    /*
ABCDE
ABCD
ABC
AB
A

*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = num-1; i >= 0; i--) {


            for (int j = 65; j <= i+65; j++) {
                System.out.print((char)j);
                
            }
            System.out.println();

            

            
        }

    }
}
