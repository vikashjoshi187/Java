import java.util.Scanner;
public class prog_25 {
   // 1	     27	    125	    343	…………	
  // 1*1*1  3*3*3   5*5*5  
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=sc.nextInt();
        for (int i = 1; i < num*2; i=i+2) {
            System.out.println(i*i*i);
        }

        

    }
}
