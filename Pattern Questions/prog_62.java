import java.util.Scanner;
public class prog_62 {
    /*
11111 
 2222 
  333 
   44 
    5
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                
                if (j>=i) {

                    System.out.print(i);

                    

                }
                else{
                    System.out.print(" ");
                }

                
                
            }
            System.out.println(" ");
            
        }

    }
    
}
