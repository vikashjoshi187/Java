import java.util.Scanner;
public class prog_58 {
    /*
123456 
 1___5 
  1__4 
   1_3 
    12 
     1  
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int temp=1;
            for (int j = 1; j <= num; j++) {
            if (j>=i) {
            
                if (i==1 || j== num || temp==1) {
                    System.out.print(temp);
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
