import java.util.Scanner;
public class prog_63 {
    /*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
*/
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
for (int i = 1; i <= num; i++) {
    for (int sp= 1; sp <= num-i; sp++) {
        System.out.print(" ");
        
    }
    for (int j = 1; j <=i ; j++) {
        
        
            System.out.print(j+" ");
        
        
    }
    System.out.println();
    
}

}    
}
