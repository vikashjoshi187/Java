import java.util.Scanner;
public class prog_76 {
    /*
A B C D E F 
 A B C D E 
  A B C D 
   A B C 
    A B 
     A 
*/
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
for (int i = num; i >= 1; i--) {
    int temp=65;
    for (int j = 1; j <= num; j++) {
        if (j<=num-i) {
            System.out.print(" ");
            
        }
        else{
            System.out.print((char)temp+" ");
            temp++;
        }
        
        
    }
    System.out.println();
    
}

}    
}
