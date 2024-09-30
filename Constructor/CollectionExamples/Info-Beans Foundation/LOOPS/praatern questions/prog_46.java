import java.util.Scanner;
public class prog_46 {
    /*
*
**
****
*******
***********
****************
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numer");
        int num=sc.nextInt();
        int sum=1;
       for (int i = 0; i < num; i++) {
       
        sum=sum+i;

        for (int j = 1; j <= sum; j++) {
            System.out.print("*");
           
        }
        
        System.out.println();
    
       }

    }
    
}
