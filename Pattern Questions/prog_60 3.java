import java.util.Scanner;
public class prog_60 {
    /*
ABCDE 
 A__D 
  A_C 
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
                   if (i==1 || j== num || j==i) {
                    System.out.print((char)(temp+64));
                   }
                    else{
                        System.out.print("_");
                    }
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
