import java.util.Scanner;
public class prog_64 {
    /*
    A 
   A B 
  A B C 
 A B C D 
A B C D E
  
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
        
        
            System.out.print((char)(j+64)+" ");
        
        
    }
    System.out.println();
    
}

}    
}
