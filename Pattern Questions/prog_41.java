import java.util.Scanner;
public class prog_41 {
    /*
******
*   *
*  *
* *
**
*

*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        
        
        for (int i = num; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                if(j==1 || i==num || j==i ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
