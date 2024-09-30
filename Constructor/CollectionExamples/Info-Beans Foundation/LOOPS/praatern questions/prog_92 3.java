
/**
 * prog_01
 */
import java.util.Scanner;

public class prog_92 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer a number ");
        int num = sc.nextInt();

        for (int i = 1; i <= num - 1; i++) {
            for (int j = 0; j <= num - 1; j++) {
                if (j == num - 1) {
                    System.out.print(i);
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
for (int i = 1; i <= num; i++) {
            System.out.print(i);
        }

        for (int i = num - 1; i >= 1; i--) {
            System.out.print(i);
        }
System.out.println();

        for (int i = num-1; i >= 1; i--) {
            for (int j = 0; j <= num - 1; j++) {
                if (j == num - 1) {
                    System.out.print(i);
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    
    
    
    
    
    
    
    
    
    }
}