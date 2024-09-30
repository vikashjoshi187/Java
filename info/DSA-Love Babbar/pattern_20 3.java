import java.nio.channels.WritableByteChannel;
import java.util.Scanner;

public class pattern_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of row and col ");
        int n = sc.nextInt();
        int i = 1;
        int c = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j <= n-i) {
                    System.out.print(" ");
                } else {
                    System.out.print(c);
                    c++;
                }
                j++;
                if (i>1) {
                    int k=i;
                    while (k>=1) {
                         System.out.print(k);

                        k--;
                    }
                    
                }
                
            }
           
            System.out.println();
           
             c=1;
            i++;
        }

    }
}
