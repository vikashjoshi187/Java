import java.util.Scanner;
public class prog_56 {
    /*
12345 
 1234 
  123 
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
                    System.out.print(temp);
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
