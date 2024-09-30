import java.util.Scanner;
public class prog_61 {
    /*
ABCDE 
 ABCD 
  ABC 
   AB 
    A 
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            int temp=1;
            for (int j = 1; j <= num; j++) {
                
                if (j>=i) {

                    System.out.print((char)(temp+64));

                    
                    temp++;
                }
                else{
                    System.out.print(" ");
                }

                
                
            }
            System.out.println(" ");
            
        }

    }
    
}
