import java.util.Scanner;

public class prog_91 {
    /*
     1     
    212    
   32123   
  4321234  
 543212345 
65432123456
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            
            
            for (int j = num; j >= 1; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }


            for (int j = 2; j <= num; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            
            
            
            
            
            System.out.println();
        }





    }
}
