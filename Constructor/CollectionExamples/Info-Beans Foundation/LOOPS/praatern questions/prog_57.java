import java.util.Scanner;
public class prog_57 {
    /*
55555 
 4444 
  333 
   22 
    1 
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        for (int i = 1; i <= num; i++) {
            
            for (int j = 1; j <= num; j++) {
                
                if (j>=i) {
                    System.out.print(temp);
                }
                else{
                    System.out.print(" ");
                }

                
                
            }
            System.out.println(" ");
            temp--;
        }

    }
    
}
