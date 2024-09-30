/**
 * rprog_1
 */
import java.util.Scanner;
public class prog_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
if (num%2==0) {
    num++;
    
}


        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {
                  if (j==i || j==(num-i)-1 || i==1 && j==num) {
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